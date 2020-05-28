package by.itcollege.repository;

import by.itcollege.entity.Organization;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author alexandergorovtsov
 */
public interface OrganizationRepository extends CrudRepository<Organization, Long>, OrganizationRepositoryCustom {

    @Query("select e.organization from Employee e where e.firstName=?1")
    List<Organization> findAllByEmployeeName(String employeeName);

}
