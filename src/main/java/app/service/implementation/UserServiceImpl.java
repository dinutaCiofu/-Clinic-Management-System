package app.service.implementation;

import app.model.UtilizatorEntity;
import app.repository.UtilizatorRepository;
import app.service.UserService;
import app.single_point_access.RepositorySinglePointAccess;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    private UtilizatorRepository utilizatorRepository = RepositorySinglePointAccess.getUtilizatorRepository();

    @Override
    public UtilizatorEntity save(UtilizatorEntity utilizator) {

        return utilizatorRepository.save(utilizator);
    }

    @Override
    public UtilizatorEntity update(UtilizatorEntity utilizator) {
        return utilizatorRepository.update(utilizator);
    }

    @Override
    public List<UtilizatorEntity> findAll() {
        return utilizatorRepository.findAll();
    }

    @Override
    public UtilizatorEntity findById(int id) {
        return utilizatorRepository.findById(id);
    }

    @Override
    public boolean delete(UtilizatorEntity utilizator) {
        return utilizatorRepository.delete(utilizator);
    }

    @Override
    public UtilizatorEntity login(String username, String parola) {
        return utilizatorRepository.findByUsernameAndPassword(username,parola);
    }
}
