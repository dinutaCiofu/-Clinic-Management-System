package app.repository.implemetation;

import app.configuration.HibernateConfiguration;
import app.model.UtilizatorEntity;
import app.repository.UtilizatorRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class UtilizatorRepositoryImpl implements UtilizatorRepository{
    @Override
    public UtilizatorEntity save(UtilizatorEntity entity) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Integer idOnUserSaved = (Integer) session.save(entity);

        transaction.commit();
        session.close();

        return findById(idOnUserSaved);
    }

    @Override
    public UtilizatorEntity update(UtilizatorEntity entity) {
       SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
       Session session = sessionFactory.openSession();
       Transaction transaction = session.beginTransaction();

       int id = entity.getId();
       session.saveOrUpdate(entity);

       transaction.commit();
       session.close();

       return findById(id);
    }

    @Override
    public UtilizatorEntity findById(Integer id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        TypedQuery<UtilizatorEntity> query = session.getNamedQuery("findUserById");
        query.setParameter("id", id);

        UtilizatorRepository utilizator;
        try {
            utilizator = (UtilizatorRepository) query.getSingleResult();
        } catch (NoResultException e) {
            utilizator = null;
        }

        transaction.commit();
        session.close();

        return (UtilizatorEntity) utilizator;

    }

    @Override
    public List<UtilizatorEntity> findAll() {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Native SQL - not preferred
        // Query query = session.createSQLQuery("select * from person");

        TypedQuery<UtilizatorEntity> query = session.getNamedQuery("findAllUsers");
        List<UtilizatorEntity> utilizatori = query.getResultList();

        transaction.commit();
        session.close();

        return utilizatori;

    }

    @Override
    public boolean delete(UtilizatorEntity entity) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        int id = entity.getId();
        session.delete(entity);

        transaction.commit();
        session.close();

        return findById(id) == null;
    }

    @Override
    public UtilizatorEntity findByName(String nume) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Used a Named Query - best solution
        TypedQuery<UtilizatorEntity> query = session.getNamedQuery("findUserByName");
        query.setParameter("nume", nume);
        UtilizatorEntity utilizator;
        try {
            utilizator = query.getSingleResult();
        } catch (NoResultException e) {
            utilizator = null;
        }


        transaction.commit();
        session.close();

        return utilizator;

    }

    @Override
    public UtilizatorEntity findByUsernameAndPassword(String username, String password) {
        SessionFactory sessionFactory=HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //TO DO

        TypedQuery<UtilizatorEntity> query = session.getNamedQuery("findUserByUsernameAndPassword");
        query.setParameter("username", username);
        query.setParameter("parola", password);

        UtilizatorEntity utilizator;
        try{
            utilizator = query.getSingleResult();
        }catch(NoResultException e){
            utilizator = null;
        }

        transaction.commit();
        session.close();

        return utilizator;
    }
}
