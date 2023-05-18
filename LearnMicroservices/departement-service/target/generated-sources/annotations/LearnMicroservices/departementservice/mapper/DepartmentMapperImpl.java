package LearnMicroservices.departementservice.mapper;

import LearnMicroservices.departementservice.dto.DepartmentDto;
import LearnMicroservices.departementservice.entity.Department;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-18T12:12:38+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.3 (Amazon.com Inc.)"
)
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public DepartmentDto maptoDepartmentDto(Department department) {
        if ( department == null ) {
            return null;
        }

        DepartmentDto departmentDto = new DepartmentDto();

        departmentDto.setId( department.getId() );
        departmentDto.setDepartmentName( department.getDepartmentName() );
        departmentDto.setDepartmentDescription( department.getDepartmentDescription() );
        departmentDto.setDepartmentCode( department.getDepartmentCode() );

        return departmentDto;
    }

    @Override
    public Department maptoDepartment(DepartmentDto departmentDto) {
        if ( departmentDto == null ) {
            return null;
        }

        Department department = new Department();

        department.setId( departmentDto.getId() );
        department.setDepartmentName( departmentDto.getDepartmentName() );
        department.setDepartmentDescription( departmentDto.getDepartmentDescription() );
        department.setDepartmentCode( departmentDto.getDepartmentCode() );

        return department;
    }
}
