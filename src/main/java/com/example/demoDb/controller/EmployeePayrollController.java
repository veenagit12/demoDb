package com.example.demoDb.controller;



import com.example.demoDb.entity.Employee;
import com.example.demoDb.entity.EmployeePayroll;
import com.example.demoDb.repository.EmployeePayrollRepository;
import com.example.demoDb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeePayrollController {

    @Autowired
    private EmployeePayrollRepository employeePayrollRepository;

    @GetMapping(value="/employeePayroll")
    public List<EmployeePayroll> getEmployeePayroll()
    {
        return employeePayrollRepository.findAll();
    }

    @PostMapping(value="/employeePayroll")
    public EmployeePayroll addEmployeePayroll(@RequestBody EmployeePayroll employeePayroll)
    {
        return employeePayrollRepository.save(employeePayroll);
    }

}
