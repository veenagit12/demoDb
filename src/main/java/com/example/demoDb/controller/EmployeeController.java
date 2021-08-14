package com.example.demoDb.controller;



import com.example.demoDb.entity.Employee;
import com.example.demoDb.entity.EmployeePayroll;
import com.example.demoDb.repository.EmployeePayrollRepository;
import com.example.demoDb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(value="/employee")
    public List<Employee> getEmployees()
    {
        return employeeRepository.findAll();
    }

    @PostMapping(value ="/employee")
    public Employee addNewEmployee(@RequestBody Employee e1)
    {
        return employeeRepository.save(e1);
    }

    @GetMapping(value = "/employee/{employeeId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getEmployee(@PathVariable Integer employeeId)
    {
        return employeeRepository.findAllByEmployeePayrollEmployeeId(employeeId);

    }


    }


