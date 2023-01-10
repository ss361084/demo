package com.test.demo.service;

import com.test.demo.service.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    EmployeeDTO save(EmployeeDTO employeeDTO);
    List<EmployeeDTO> findAllEmployee();
}
