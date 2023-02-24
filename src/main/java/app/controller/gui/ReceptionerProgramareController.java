package app.controller.gui;

import app.model.ProgramareEntity;
import app.model.ServiciuMedicalEntity;
import app.repository.ServiciuMedicalRepository;
import app.repository.implemetation.PacientRepositoryImpl;
import app.single_point_access.GUIFrameSinglePointAccess;
import app.single_point_access.ServiceSinglePointAccess;
import app.view.ReceptionerProgramarePacientPanel;
import app.view.DatePicker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.Time;

import java.util.*;

import app.repository.implemetation.ServiciuMedicalRepositoryImpl;
import app.model.PacientEntity;
import app.service.ReceptionerProgramareService;
import lombok.SneakyThrows;


public class ReceptionerProgramareController {
   private ReceptionerProgramarePacientPanel receptionerProgramarePacientPanel;
  private ServiciuMedicalRepositoryImpl serviciuMedicalRepository = new ServiciuMedicalRepositoryImpl();
  private PacientRepositoryImpl pacientRepository = new PacientRepositoryImpl();
   public void startLogic(){
       receptionerProgramarePacientPanel = new ReceptionerProgramarePacientPanel();

       DefaultListModel model = new DefaultListModel();
       List<ServiciuMedicalEntity> serviciiMedicale = serviciuMedicalRepository.findAll();

       for (int i = 0; i<serviciiMedicale.size();i++) {
          String numeServiciu = serviciiMedicale.get(i).getNumeServiciu();
          model.addElement(numeServiciu);
        //  System.out.println(numeServiciu);

       }
       receptionerProgramarePacientPanel.getServiciiMedicaleList().setModel(model);

       DefaultListModel model1 = new DefaultListModel();
       List<PacientEntity> pacientiList=pacientRepository.findAll();
       for(int i = 0; i<pacientiList.size();i++){
           String numePacient = pacientiList.get(i).getNume();
           String prenumePacient = pacientiList.get(i).getPrenume();
           String numeSiPrenumePacient = numePacient+" "+prenumePacient;
           model1.addElement(numeSiPrenumePacient);
       }
       receptionerProgramarePacientPanel.getPacientiList().setModel(model1);
       GUIFrameSinglePointAccess.changePanel(receptionerProgramarePacientPanel.getMainPanel(), "Receptioner");

       //inregistrare pacient nou
       receptionerProgramarePacientPanel.getInregistrarePacientButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            String nume = receptionerProgramarePacientPanel.getNumeField().getText();
            String prenume = receptionerProgramarePacientPanel.getPrenumeField().getText();
            String cnp = receptionerProgramarePacientPanel.getCnpField().getText();

            if(nume!="" && prenume !="" && cnp!=""){
                PacientEntity pacient = new PacientEntity();
                pacient.setNume(nume);
                pacient.setPrenume(prenume);
                pacient.setCnp(cnp);
                List<ProgramareEntity> programari;
                programari= new ArrayList<ProgramareEntity>();
                pacient.setProgramari(programari);

                ReceptionerProgramareService receptionerProgramareService = ServiceSinglePointAccess.getReceptionerProgramareService();
                PacientEntity savedPacient = receptionerProgramareService.inregistrarePacient(pacient);

                System.out.println(pacient.getNume()+ ", " +pacient.getPrenume());
            }
            else{
                GUIFrameSinglePointAccess.showDialogMessage("Introduceți datele pacientului!");
            }

           }
       });

       //afiseaza calendarul
       receptionerProgramarePacientPanel.getAlegeDataBtn().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               //Date data = new Date();

              // DatePicker data = new DatePicker(receptionerProgramarePacientPanel.getMainPanel());
               JLabel label = new JLabel("Selected Date:");

                final JTextField text = new JTextField(20);
                JButton b = new JButton("popup");
                JPanel p = new JPanel();
                p.add(label);
                p.add(text);
                p.add(b);
                final JFrame f = new JFrame();
                f.getContentPane().add(p);
                f.pack();
                f.setVisible(true);

                b.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        text.setText(new DatePicker(f).setPickedDate());
                        receptionerProgramarePacientPanel.getSelectedDateLabel().setText(text.getText());
//                        System.out.println(text.getText());
                        f.setVisible(false);
                    }
                });


           }
       });

       // programare noua
       receptionerProgramarePacientPanel.getProgramarePacientButton().addActionListener(new ActionListener() {
           @SneakyThrows
           @Override
           public void actionPerformed(ActionEvent e) {
               String[] numePrenumePacient = new String[2];
               String numeServiciuMedical = "";
               Date date=null;
               Time time=null;
               String ziua=null;
               try {
                   numePrenumePacient = receptionerProgramarePacientPanel.getPacientiList().getSelectedValue().toString().split(" ", 2);
                   numeServiciuMedical = receptionerProgramarePacientPanel.getServiciiMedicaleList().getSelectedValue().toString();

                   // System.out.println(numeServiciuMedical);

                    ziua = receptionerProgramarePacientPanel.getAlegeZiuaBox().getSelectedItem().toString();
                   String[] data = receptionerProgramarePacientPanel.getSelectedDateLabel().getText().split("-", 3);
                   String newDate = data[2] + "-" + data[1] + "-" + data[0];
                   date = Date.valueOf(newDate);
//               System.out.println(date);
                   String ora = receptionerProgramarePacientPanel.getOraComboBox().getSelectedItem().toString() + ":00";
                    time = Time.valueOf(ora);

//                System.out.println(t);

               } catch (Exception exp) {
                   GUIFrameSinglePointAccess.showDialogMessage("Date invalide!");
               }
               finally {
//               System.out.println(numeServiciuMedical);

               //create a ServiciuMedicalEntity entity from which I will get durata
               ServiciuMedicalEntity serviciuMedicalEntity = serviciuMedicalRepository.findByName(numeServiciuMedical);
               String durata = String.valueOf(serviciuMedicalEntity.getDurata());
               receptionerProgramarePacientPanel.getDurataValueLabel().setText(durata + " minute");
//               System.out.println(durata);

               ProgramareEntity programareNoua = new ProgramareEntity();
               programareNoua.setData(date);
               programareNoua.setOra(time);
               programareNoua.setDurata(serviciuMedicalEntity.getDurata());
               programareNoua.setZiuaSaptamana(ziua);
               ReceptionerProgramareService receptionerProgramareService = ServiceSinglePointAccess.getReceptionerProgramareService();
               programareNoua = receptionerProgramareService.saveProgramare(programareNoua);
               receptionerProgramareService.addServiciuMedical(programareNoua,serviciuMedicalEntity);
               System.out.println(programareNoua.getServiciiMedicale().get(0).getNumeServiciu());


               PacientEntity pacientProgramat = receptionerProgramareService.findPacientByNumeAndPrenume(numePrenumePacient[0],numePrenumePacient[1]);
               System.out.println(pacientProgramat.getNume());
               receptionerProgramareService.addProgramare(pacientProgramat,programareNoua);


           //    System.out.println(programareNoua.getServiciiMedicale().get(0).getNumeServiciu());

              // PacientEntity pacientProgramat = pacientRepository.findByNumeAndPrenume(numePrenumePacient[0], numePrenumePacient[1]);

             //  List<ProgramareEntity> programareEntityList = pacientProgramat.getProgramari();
             //  ProgramareEntity savedProgramare = receptionerProgramareService.adaugaProgramare(programareNoua);
              // programareEntityList.add(savedProgramare);
               //pacientProgramat.setProgramari(programareEntityList);
               //PacientEntity pacientProgramatUpdate =pacientRepository.update(pacientProgramat);
               }

           }
       });

       //back to menu panel..
       receptionerProgramarePacientPanel.getBackBtn().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               ReceptionerMenuController receptionerMenuController = new ReceptionerMenuController();
               receptionerMenuController.startLogic();
           }
       });
   }

}
