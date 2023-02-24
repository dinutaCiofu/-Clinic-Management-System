package app.repository.implemetation;

import app.configuration.HibernateConfiguration;
import app.model.ProgramareEntity;
import app.repository.ProgramareRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import app.model.PacientEntity;
import app.model.ServiciuMedicalEntity;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;


import java.util.Date;
import java.util.List;

public class ProgramareRepositoryImpl implements ProgramareRepository {
    @Override
    public ProgramareEntity adaugaProgramare(ProgramareEntity entity) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Integer idOnProgramareSaved = (Integer) session.save(entity);

        transaction.commit();
        session.close();

        return findById(idOnProgramareSaved);
    }

    @Override
    public ProgramareEntity save(ProgramareEntity entity) {
        return null;
    }

    @Override
    public ProgramareEntity update(ProgramareEntity entity) {
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
    public ProgramareEntity findById(Integer id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        TypedQuery<ProgramareEntity> query = session.getNamedQuery("findProgramareById");
        query.setParameter("id", id);

        ProgramareEntity programare;
        try {
            programare = (ProgramareEntity) query.getSingleResult();
        } catch (NoResultException e) {
            programare = null;
        }

        transaction.commit();
        session.close();

        return programare;
    }

    @Override
    public List<ProgramareEntity> findAll() {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        TypedQuery<ProgramareEntity> query = session.getNamedQuery("findAllProgramari");
        List<ProgramareEntity> programari = query.getResultList();

        transaction.commit();
        session.close();

        return programari;

    }

    @Override
    public boolean delete(ProgramareEntity entity) {
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
    public ProgramareEntity findProgramareByDate(Date data) {

        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Used a Named Query - best solution
        TypedQuery<ProgramareEntity> query = session.getNamedQuery("findProgramareByDate");
        query.setParameter("data", data);
        ProgramareEntity programare;
        try {
            programare = query.getSingleResult();
        } catch (NoResultException e) {
            programare = null;
        }


        transaction.commit();
        session.close();

        return programare;

    }
}
