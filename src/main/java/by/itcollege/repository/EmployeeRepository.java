package by.itcollege.repository;

import by.itcollege.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author alexandergorovtsov
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long>
{

    @Query("select e from Employee e where e.firstName=:firstName")
    Employee findByFirstName(String firstName);

    Employee save(Employee employee);
    //List<Employee> findAllByOrganizationNameContaining(String name);
}
