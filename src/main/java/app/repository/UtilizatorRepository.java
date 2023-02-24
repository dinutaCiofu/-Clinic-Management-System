package app.repository;
import app.model.UtilizatorEntity;

public interface UtilizatorRepository extends CRUDRepository<UtilizatorEntity, Integer> {
        UtilizatorEntity findByName(String nume);

        UtilizatorEntity findByUsernameAndPassword(String username, String password);
}
