package app.service;

import app.model.ReceptionerEntity;
import app.model.PacientEntity;
import app.model.ProgramareEntity;
import app.model.ServiciuMedicalEntity;

import java.util.List;
public interface ReceptionerProgramareService {
    PacientEntity inregistrarePacient(PacientEntity pacient);
    ProgramareEntity saveProgramare(ProgramareEntity programare);

    void addServiciuMedical(ProgramareEntity programare, ServiciuMedicalEntity serviciuMedical);

    PacientEntity findPacientByNumeAndPrenume(String nume, String prenume);

    void addProgramare(PacientEntity pacient,ProgramareEntity programare);
}
