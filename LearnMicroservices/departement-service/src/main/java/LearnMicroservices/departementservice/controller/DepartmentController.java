package LearnMicroservices.departementservice.controller;

import LearnMicroservices.departementservice.dto.DepartmentDto;
import LearnMicroservices.departementservice.entity.Department;
import LearnMicroservices.departementservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;
    @PostMapping("/save")
    public ResponseEntity<DepartmentDto> saveDepartments(@RequestBody DepartmentDto departmentDto){
       return new ResponseEntity<>(departmentService.saveDepartment(departmentDto), HttpStatus.CREATED);
    }
    @GetMapping("/get")
    public ResponseEntity<List<Department>>getDepartments(){
        List<Department> departmentList=departmentService.getAllDepartments();

        return new ResponseEntity<>(departmentList,HttpStatus.OK);
    }
    @GetMapping("/{getByName}")
    public ResponseEntity<DepartmentDto> getByDepartmentName(@PathVariable("getByName") String departmentName){
        return new ResponseEntity<>(departmentService.getByDepartmentName(departmentName),HttpStatus.OK);
    }
    @GetMapping("/getByCode/{getByCode}")
    public ResponseEntity<DepartmentDto> getByDepartmentCode(@PathVariable("getByCode") String departmentCode){
        return new ResponseEntity<>(departmentService.getByDepartmentCode(departmentCode),HttpStatus.OK);
    }



}
