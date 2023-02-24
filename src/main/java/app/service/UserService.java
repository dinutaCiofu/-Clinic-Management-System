package app.service;
import app.model.UtilizatorEntity;
import app.model.FunctieEntity;

import java.util.List;

public interface UserService {
    UtilizatorEntity save(UtilizatorEntity utilizator);

    UtilizatorEntity update(UtilizatorEntity utilizator);

    List<UtilizatorEntity> findAll();

    UtilizatorEntity findById(int id);

    boolean delete (UtilizatorEntity utilizator);

    UtilizatorEntity login(String username, String parola);
}
