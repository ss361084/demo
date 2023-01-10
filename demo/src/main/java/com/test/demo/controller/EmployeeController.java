package com.test.demo.controller;

import com.test.demo.service.EmployeeService;
import com.test.demo.service.dto.EmployeeDTO;
import com.test.demo.service.exception.EmployeeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class EmployeeController {

    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("employee")
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO) throws URISyntaxException {
        log.debug("Rest request to Save Employee");
        if (employeeDTO.getId() != null) {
            throw new EmployeeException("Id found during create employee");
        }
        EmployeeDTO result = employeeService.save(employeeDTO);
        return ResponseEntity.created(new URI("/api/employee/"+result.getId()))
                .body(result);
    }

    @GetMapping("employee")
    public ResponseEntity<List<EmployeeDTO>> getAllEmployee() {
        log.debug("Rest request to get All Employee");
        List<EmployeeDTO> employeeDTOS = employeeService.findAllEmployee();
        return ResponseEntity.ok(employeeDTOS);
    }
}
