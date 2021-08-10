package com.example.demoDb.repository;

import com.example.demoDb.entity.EmployeePayroll;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayroll,Integer> {
}
