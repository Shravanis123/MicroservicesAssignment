package LearnMicroservices.departementservice.mapper;


import LearnMicroservices.departementservice.dto.DepartmentDto;
import LearnMicroservices.departementservice.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper {

    DepartmentMapper MAPPER= Mappers.getMapper(DepartmentMapper.class);
    DepartmentDto maptoDepartmentDto(Department department);
    Department maptoDepartment(DepartmentDto departmentDto);
}
