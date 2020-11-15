package com.sda.carrentalservice.restcontroller;

import com.sda.carrentalservice.dto.EmployeeDTO;
import com.sda.carrentalservice.entity.Employee;
import com.sda.carrentalservice.service.EmployeeService;
import com.sda.carrentalservice.transformer.EmployeeTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeTransformer employeeTransformer;

    @Autowired
    public EmployeeController(EmployeeService employeeService, EmployeeTransformer employeeTransformer) {
        this.employeeService = employeeService;
        this.employeeTransformer = employeeTransformer;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<EmployeeDTO> findEmployeeById(Long id) {
        Employee employee = employeeService.findEmployeeById(id);
        EmployeeDTO employeeDTO = employeeTransformer.transformFromEntityToDTO(employee);
        return ResponseEntity.ok(employeeDTO);
    }
}
