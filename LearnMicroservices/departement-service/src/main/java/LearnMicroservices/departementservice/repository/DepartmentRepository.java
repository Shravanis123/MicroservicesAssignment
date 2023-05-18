package LearnMicroservices.departementservice.repository;

import LearnMicroservices.departementservice.dto.DepartmentDto;
import LearnMicroservices.departementservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
   Department findByDepartmentName(String departmentName);
   Department findByDepartmentCode(String departmentCode);
}
