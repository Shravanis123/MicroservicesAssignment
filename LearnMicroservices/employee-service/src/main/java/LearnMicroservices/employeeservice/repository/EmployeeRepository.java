package LearnMicroservices.employeeservice.repository;

import LearnMicroservices.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findByEmail(String email);
}