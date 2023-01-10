package com.test.demo.service.mapper;

import com.test.demo.entity.Employee;
import com.test.demo.service.dto.EmployeeDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-10T00:08:57-0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDTO toDto(Employee e) {
        if ( e == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setId( e.getId() );
        employeeDTO.setName( e.getName() );
        employeeDTO.setMobile( e.getMobile() );

        return employeeDTO;
    }

    @Override
    public Employee toEntity(EmployeeDTO d) {
        if ( d == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( d.getId() );
        employee.setName( d.getName() );
        employee.setMobile( d.getMobile() );

        return employee;
    }
}
