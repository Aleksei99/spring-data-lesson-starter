package by.itcollege.repository;

import by.itcollege.entity.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

/**
 * @author alexandergorovtsov
 */
public class OrganizationRepositoryImpl implements OrganizationRepositoryCustom {

    private final EntityManagerFactory entityManagerFactory;

    @Autowired
    public OrganizationRepositoryImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Transactional
    @Override
    public Organization findByName(String name) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        //EntityTransaction transaction = entityManager.getTransaction();
        //transaction.begin();

        List<Organization> organizations = entityManager.createQuery(
                "select o from Organization o where o.name=:orgName", Organization.class)
                .setParameter("orgName", name)
                .getResultList();

        //transaction.commit();
        entityManager.close();
        return !organizations.isEmpty() ? organizations.get(0) : null;
    }
}
