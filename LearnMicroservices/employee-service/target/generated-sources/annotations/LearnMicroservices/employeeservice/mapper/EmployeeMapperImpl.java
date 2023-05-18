package LearnMicroservices.employeeservice.mapper;

import LearnMicroservices.employeeservice.dto.EmployeeDto;
import LearnMicroservices.employeeservice.entity.Employee;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-18T12:03:36+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.3 (Amazon.com Inc.)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDto mapToEmployeeDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setId( employee.getId() );
        employeeDto.setFirstName( employee.getFirstName() );
        employeeDto.setLastName( employee.getLastName() );
        employeeDto.setEmail( employee.getEmail() );

        return employeeDto;
    }

    @Override
    public Employee mapToEmployee(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( employeeDto.getId() );
        employee.setFirstName( employeeDto.getFirstName() );
        employee.setLastName( employeeDto.getLastName() );
        employee.setEmail( employeeDto.getEmail() );

        return employee;
    }
}
