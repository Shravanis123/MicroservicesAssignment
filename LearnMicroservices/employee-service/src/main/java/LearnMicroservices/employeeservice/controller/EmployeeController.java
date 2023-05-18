package LearnMicroservices.employeeservice.controller;

import LearnMicroservices.employeeservice.dto.EmployeeDto;
import LearnMicroservices.employeeservice.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<EmployeeDto> saveEmployees(@RequestBody EmployeeDto employeeDto) {
        return new ResponseEntity<>(employeeService.saveEmployees(employeeDto), HttpStatus.CREATED);
    }
    @GetMapping("/{email}")
    public ResponseEntity<EmployeeDto> getByEmail(@PathVariable("email") String email){
        return new ResponseEntity<>(employeeService.getByEmail(email),HttpStatus.OK);
    }
    @GetMapping("/getById/{id}")
    public ResponseEntity<EmployeeDto> getById(@PathVariable("id") Long id){
        return new ResponseEntity<>(employeeService.getById(id),HttpStatus.OK);
    }

}
