package com.example.demoDb.repository;


import com.example.demoDb.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findAllByEmployeePayrollEmployeeId(Integer employeeId);
}
