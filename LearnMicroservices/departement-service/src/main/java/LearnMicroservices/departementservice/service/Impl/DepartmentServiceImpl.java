package LearnMicroservices.departementservice.service.Impl;

import LearnMicroservices.departementservice.dto.DepartmentDto;
import LearnMicroservices.departementservice.entity.Department;
import LearnMicroservices.departementservice.exception.DepartmentNotFountException;
import LearnMicroservices.departementservice.mapper.DepartmentMapper;
import LearnMicroservices.departementservice.repository.DepartmentRepository;
import LearnMicroservices.departementservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department= DepartmentMapper.MAPPER.maptoDepartment(departmentDto);
//        Department department=new Department(
//                departmentDto.getId(),
//                departmentDto.getDepartmentName(),
//                departmentDto.getDepartmentDescription(),
//                departmentDto.getDepartmentCode()
//        );
        Department savedDepartment=departmentRepository.save(department);
        DepartmentDto dto=DepartmentMapper.MAPPER.maptoDepartmentDto(department);
//        DepartmentDto dto=new DepartmentDto(
//                savedDepartment.getId(),
//                savedDepartment.getDepartmentName(),
//                savedDepartment.getDepartmentDescription(),
//                savedDepartment.getDepartmentCode()
//        );
        return dto;
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public DepartmentDto getByDepartmentName(String departmentName) {
      Department department= departmentRepository.findByDepartmentName(departmentName).orElseThrow(()->new DepartmentNotFountException());
        DepartmentDto departmentDto=DepartmentMapper.MAPPER.maptoDepartmentDto(department);
//        DepartmentDto departmentDto=new DepartmentDto(
//                department.getId(),
//                department.getDepartmentName(),
//                department.getDepartmentDescription(),
//                department.getDepartmentCode()
//        );
   return departmentDto;
    }

    @Override
    public DepartmentDto getByDepartmentCode(String departmentCode) {
        Department department=departmentRepository.findByDepartmentCode(departmentCode).orElseThrow(()->new DepartmentNotFountException());
        DepartmentDto departmentDto=DepartmentMapper.MAPPER.maptoDepartmentDto(department);
        return departmentDto;
    }

}
