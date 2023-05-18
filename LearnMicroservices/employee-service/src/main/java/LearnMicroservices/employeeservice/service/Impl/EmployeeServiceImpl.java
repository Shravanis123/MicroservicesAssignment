package LearnMicroservices.employeeservice.service.Impl;

import LearnMicroservices.employeeservice.dto.EmployeeDto;
import LearnMicroservices.employeeservice.entity.Employee;
import LearnMicroservices.employeeservice.mapper.EmployeeMapper;
import LearnMicroservices.employeeservice.repository.EmployeeRepository;
import LearnMicroservices.employeeservice.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto saveEmployees(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.MAPPER.mapToEmployee(employeeDto);
//        Employee employee=new Employee(
//                employeeDto.getId(),
//                employeeDto.getFirstName(),
//                employeeDto.getLastName(),
//                employeeDto.getEmail()
//        );
        Employee savedemployee=employeeRepository.save(employee);
        EmployeeDto dto=EmployeeMapper.MAPPER.mapToEmployeeDto(savedemployee);
//        EmployeeDto dto=new EmployeeDto(
//                savedemployee.getId(),
//                savedemployee.getFirstName(),
//                savedemployee.getLastName(),
//                savedemployee.getEmail()
//        );
        return dto;
    }

    @Override
    public EmployeeDto getByEmail(String email) {
        Employee employee=employeeRepository.findByEmail(email);
        EmployeeDto employeeDto=EmployeeMapper.MAPPER.mapToEmployeeDto(employee);
//        EmployeeDto employeeDto=new EmployeeDto(
//                employee.getId(),
//                employee.getFirstName(),
//                employee.getLastName(),
//                employee.getEmail()
//        );
        return employeeDto;
    }

    @Override
    public EmployeeDto getById(Long id) {
        Employee employee=employeeRepository.findById(id).orElse(null);
        EmployeeDto employeeDto=EmployeeMapper.MAPPER.mapToEmployeeDto(employee);
//        EmployeeDto employeeDto=new EmployeeDto(
//                employee.getId(),
//                employee.getFirstName(),
//                employee.getLastName(),
//                employee.getEmail()
//        );
        return employeeDto;
    }
}
