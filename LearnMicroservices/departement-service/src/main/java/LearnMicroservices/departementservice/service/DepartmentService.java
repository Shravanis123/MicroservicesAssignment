package LearnMicroservices.departementservice.service;

import LearnMicroservices.departementservice.dto.DepartmentDto;
import LearnMicroservices.departementservice.entity.Department;

import java.util.List;

public interface DepartmentService {

    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    List<Department> getAllDepartments();
    DepartmentDto getByDepartmentName(String departmentName);
    DepartmentDto getByDepartmentCode(String departmentCode);


}
