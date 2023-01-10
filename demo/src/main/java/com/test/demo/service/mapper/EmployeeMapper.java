package com.test.demo.service.mapper;

import com.test.demo.entity.Employee;
import com.test.demo.service.dto.EmployeeDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper extends EntityMapper<EmployeeDTO, Employee> {
}
