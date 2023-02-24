package app.repository;

import app.model.PacientEntity;

public interface PacientRepository extends CRUDRepository<PacientEntity,Integer> {

    PacientEntity findByNumeAndPrenume(String nume, String prenume);


}
