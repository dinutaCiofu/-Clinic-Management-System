package app.repository.implemetation;

import app.configuration.HibernateConfiguration;
import app.model.UtilizatorEntity;
import app.repository.ServiciuMedicalRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import app.model.ServiciuMedicalEntity;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class ServiciuMedicalRepositoryImpl implements ServiciuMedicalRepository {

    @Override
    public ServiciuMedicalEntity save(ServiciuMedicalEntity entity) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Integer idOnServiciuMedicalSaved = (Integer) session.save(entity);

        transaction.commit();
        session.close();

        return findById(idOnServiciuMedicalSaved);
    }

    @Override
    public ServiciuMedicalEntity update(ServiciuMedicalEntity entity) {
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
    public ServiciuMedicalEntity findById(Integer id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        TypedQuery<ServiciuMedicalEntity> query = session.getNamedQuery("findServiciuMedicalById");
        query.setParameter("id", id);

        ServiciuMedicalRepository serviciuMedical;
        try {
            serviciuMedical = (ServiciuMedicalRepository) query.getSingleResult();
        } catch (NoResultException e) {
            serviciuMedical = null;
        }

        transaction.commit();
        session.close();

        return (ServiciuMedicalEntity) serviciuMedical;

    }
    @Override
    public List<ServiciuMedicalEntity> findAll() {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        TypedQuery<ServiciuMedicalEntity> query = session.getNamedQuery("findAllServiciiMedicale");
        List<ServiciuMedicalEntity> serviciiMedicale = query.getResultList();

        transaction.commit();
        session.close();

        return serviciiMedicale;
    }

    @Override
    public boolean delete(ServiciuMedicalEntity entity) {
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
    public ServiciuMedicalEntity findByName(String name) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Used a Named Query - best solution
        TypedQuery<ServiciuMedicalEntity> query = session.getNamedQuery("findServiciuMedicalByName");
        query.setParameter("numeServiciu", name);
        ServiciuMedicalEntity serviciuMedical;
        try {
            serviciuMedical = query.getSingleResult();
        } catch (NoResultException e) {
            serviciuMedical = null;
        }


        transaction.commit();
        session.close();

        return serviciuMedical;

    }
}
