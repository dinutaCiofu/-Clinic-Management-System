package app.repository.implemetation;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import app.configuration.HibernateConfiguration;


import app.model.PacientEntity;
import app.repository.PacientRepository;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;


public class PacientRepositoryImpl implements PacientRepository {
    @Override
    public PacientEntity save(PacientEntity entity) {

        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Integer idOnPacientSaved = (Integer) session.save(entity);

        transaction.commit();
        session.close();

        return findById(idOnPacientSaved);

    }

    @Override
    public PacientEntity update(PacientEntity entity) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Integer id = entity.getId();
        session.saveOrUpdate(entity);

        transaction.commit();
        session.close();

        return findById(id);

    }

    @Override
    public PacientEntity findById(Integer id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        TypedQuery<PacientEntity> query = session.getNamedQuery("findPacientById");
        query.setParameter("id", id);

       PacientEntity pacient;
        try {
            pacient = (PacientEntity) query.getSingleResult();
        } catch (NoResultException e) {
            pacient = null;
        }

        transaction.commit();
        session.close();

        return pacient;

    }

    @Override
    public List<PacientEntity> findAll() {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        TypedQuery<PacientEntity> query = session.getNamedQuery("findAllPacients");
        List<PacientEntity> pacienti = query.getResultList();

        transaction.commit();
        session.close();

        return pacienti;

    }

    @Override
    public boolean delete(PacientEntity entity) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Integer id = entity.getId();
        session.delete(entity);

        transaction.commit();
        session.close();

        return findById(id) == null;

    }

    @Override
    public PacientEntity findByNumeAndPrenume(String nume, String prenume) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // TO DO
        // Same logic - extract it somehow
        TypedQuery<PacientEntity> query = session.getNamedQuery("findPacientByNumeAndPrenume");
        query.setParameter("nume", nume);
        query.setParameter("prenume", prenume);

        PacientEntity pacient;
        try {
            pacient = query.getSingleResult();
        } catch (NoResultException e) {
            pacient = null;
        }

        transaction.commit();
        session.close();

        return pacient;

    }
}
