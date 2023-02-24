package app.repository;
import app.model.FunctieEntity;

public interface FunctieRepository extends CRUDRepository<FunctieEntity, Integer>{
    FunctieEntity findFunctieByName(String name);
}
