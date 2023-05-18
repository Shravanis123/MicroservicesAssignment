package LearnMicroservices.employeeservice.service;

import LearnMicroservices.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployees(EmployeeDto employeeDto);
    EmployeeDto getByEmail(String email);
    EmployeeDto getById(Long id);

}
