package tech.factory.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.factory.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    void deleteEmployeeById(Long id);


     /* may we have a situation where i might not have that employee. so we let`s
     * say they pass in some random ,option: not Emloyeee*/
    Optional<Employee> findEmployeeById(Long id);
}
