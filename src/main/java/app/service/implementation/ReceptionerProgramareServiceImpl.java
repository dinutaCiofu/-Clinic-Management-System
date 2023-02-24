package app.service.implementation;

import app.model.ServiciuMedicalEntity;
import app.repository.PacientRepository;
import app.repository.ProgramareRepository;
import app.single_point_access.RepositorySinglePointAccess;

import app.model.PacientEntity;
import app.model.ProgramareEntity;
import app.service.ReceptionerProgramareService;
import app.repository.ServiciuMedicalRepository;

import java.util.ArrayList;

public class ReceptionerProgramareServiceImpl implements ReceptionerProgramareService {

    //pentru inregistrarea pacientului
    private PacientRepository pacientRepository = RepositorySinglePointAccess.getPacientRepository();
    //pentru crearea unei programari noi
    private ProgramareRepository programareRepository = RepositorySinglePointAccess.getProgramareRepository();
    private ServiciuMedicalRepository serviciuMedicalRepository = RepositorySinglePointAccess.getServiciuMedicalRepository();

    @Override
    public PacientEntity inregistrarePacient(PacientEntity pacient) {
        return pacientRepository.save(pacient);
    }

    @Override
    public ProgramareEntity saveProgramare(ProgramareEntity programare) {
        return programareRepository.adaugaProgramare(programare);
    }

    @Override
    public void addServiciuMedical(ProgramareEntity programare, ServiciuMedicalEntity serviciuMedical) {
        if(programare.getServiciiMedicale()==null){
            programare.setServiciiMedicale(new ArrayList<>());
        }

//        if(serviciuMedical.getId() == null || serviciuMedicalRepository.findById(serviciuMedical.getId())==null){
//            serviciuMedical=serviciuMedicalRepository.save(serviciuMedical);
//        }

        programare.getServiciiMedicale().add(serviciuMedical);
        programareRepository.update(programare);
    }

    @Override
    public PacientEntity findPacientByNumeAndPrenume(String nume, String prenume) {
        return pacientRepository.findByNumeAndPrenume(nume, prenume);
    }

    @Override
    public void addProgramare(PacientEntity pacient, ProgramareEntity programare) {
        if(pacient.getProgramari()==null){
            pacient.setProgramari(new ArrayList<>());
        }

        pacient.getProgramari().add(programare);
        pacientRepository.update(pacient);

    }
}
