package LearnMicroservices.departementservice.repository;

import LearnMicroservices.departementservice.dto.DepartmentDto;
import LearnMicroservices.departementservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
   Optional<Department> findByDepartmentName(String departmentName);

  Optional<Department> findByDepartmentCode(String departmentCode);
}
