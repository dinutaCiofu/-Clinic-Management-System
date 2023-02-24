package app.repository;

import app.model.ServiciuMedicalEntity;

public interface ServiciuMedicalRepository extends  CRUDRepository<ServiciuMedicalEntity, Integer>{
    ServiciuMedicalEntity findByName(String name);
}
