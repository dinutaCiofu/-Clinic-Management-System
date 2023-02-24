package app.controller.gui;

import app.model.ProgramareEntity;
import app.model.ServiciuMedicalEntity;
import app.repository.ServiciuMedicalRepository;
import app.repository.implemetation.PacientRepositoryImpl;
import app.single_point_access.GUIFrameSinglePointAccess;
import app.single_point_access.ServiceSinglePointAccess;
import app.view.EmitereBonFiscalPanel;
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


public class EmitereBonFiscalController {
    private EmitereBonFiscalPanel emitereBonFiscalPanel;

    private ServiciuMedicalRepositoryImpl serviciuMedicalRepository = new ServiciuMedicalRepositoryImpl();
    private PacientRepositoryImpl pacientRepository = new PacientRepositoryImpl();

    public void startLogic(){
        emitereBonFiscalPanel = new EmitereBonFiscalPanel();

        DefaultListModel model = new DefaultListModel();
        List<PacientEntity> pacienti = pacientRepository.findAll();

        for(int i = 0; i<pacienti.size();i++){
            String numeSiPrenume = pacienti.get(i).getNume()+" "+pacienti.get(i).getPrenume();
            model.addElement(numeSiPrenume);
        }
        emitereBonFiscalPanel.getListaPacienti().setModel(model);
        GUIFrameSinglePointAccess.changePanel(emitereBonFiscalPanel.getMainPanel(),"Emitere bon fiscal");

        emitereBonFiscalPanel.getEmiteBonBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] numePrenumePacient = new String[2];
                Integer pretTotal = 0;
                try{
                    numePrenumePacient = emitereBonFiscalPanel.getListaPacienti().getSelectedValue().toString().split(" ",2);
//                    System.out.println(numePrenumePacient[0]);
//                    System.out.println(numePrenumePacient[1]);

                    PacientEntity pacient = new PacientEntity();
                    pacient = pacientRepository.findByNumeAndPrenume(numePrenumePacient[0], numePrenumePacient[1]);
//                    System.out.println(pacient.getNume());
                    DefaultListModel model1 = new DefaultListModel(); //pt servicii medicale
                    DefaultListModel model2 = new DefaultListModel(); // pt preturi

                    List<ProgramareEntity> programari = pacient.getProgramari();

                    for(int i = 0;i < programari.size();i++)
                    {
                        List<ServiciuMedicalEntity> serviciiMedicale = programari.get(i).getServiciiMedicale();
                        for(int j = 0; j < serviciiMedicale.size(); j++){
                            String numeServiciuMedical = serviciiMedicale.get(j).getNumeServiciu();
                            Integer pretServiciuMedical = serviciiMedicale.get(j).getPret();
                            pretTotal+=pretServiciuMedical;
                            model1.addElement(numeServiciuMedical);
                            model2.addElement(pretServiciuMedical.toString());
                        }
                    }
                    emitereBonFiscalPanel.getServiciiMedicaleList().setModel(model1);
                    emitereBonFiscalPanel.getPretList().setModel(model2);

                    emitereBonFiscalPanel.getTotalValueLabel().setText(pretTotal.toString());

                }catch (Exception exp) {
                    GUIFrameSinglePointAccess.showDialogMessage("Date invalide!");
                }

            }
        });


        emitereBonFiscalPanel.getBackBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReceptionerMenuController receptionerMenuController = new ReceptionerMenuController();
                receptionerMenuController.startLogic();
            }
        });


    }
}
