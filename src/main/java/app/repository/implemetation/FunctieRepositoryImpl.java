package app.repository.implemetation;

import app.model.FunctieEntity;
import app.repository.FunctieRepository;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import app.configuration.HibernateConfiguration;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;


import java.util.List;

public class FunctieRepositoryImpl implements FunctieRepository {
    @Override
    public FunctieEntity save(FunctieEntity entity) {
        return null;
    }

    @Override
    public FunctieEntity update(FunctieEntity entity) {
        return null;
    }

    @Override
    public FunctieEntity findById(Integer id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        TypedQuery<FunctieEntity> query = session.getNamedQuery("findFunctieById");
        query.setParameter("id", id);

        FunctieEntity functie;
        try {
            functie = (FunctieEntity) query.getSingleResult();
        } catch (NoResultException e) {
            functie = null;
        }

        transaction.commit();
        session.close();

        return functie;

    }

    @Override
    public List<FunctieEntity> findAll() {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Native SQL - not preferred
        // Query query = session.createSQLQuery("select * from person");

        TypedQuery<FunctieEntity> query = session.getNamedQuery("findAllFunctions");
        List<FunctieEntity> functii = query.getResultList();

        transaction.commit();
        session.close();

        return functii;

    }

    @Override
    public boolean delete(FunctieEntity entity) {
        return false;
    }

    @Override
    public FunctieEntity findFunctieByName(String name) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Used a Named Query - best solution
        TypedQuery<FunctieEntity> query = session.getNamedQuery("findFunctieByName");
        query.setParameter("numeFunctie", name);
        FunctieEntity functie;
        try {
            functie = query.getSingleResult();
        } catch (NoResultException e) {
            functie = null;
        }


        transaction.commit();
        session.close();

        return functie;

    }
}
