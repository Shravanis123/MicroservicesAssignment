package LearnMicroservices.employeeservice.mapper;

import LearnMicroservices.employeeservice.dto.EmployeeDto;
import LearnMicroservices.employeeservice.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper MAPPER= Mappers.getMapper(EmployeeMapper.class);
    EmployeeDto mapToEmployeeDto(Employee employee);
    Employee mapToEmployee(EmployeeDto employeeDto);
}
