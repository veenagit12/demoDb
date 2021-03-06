package com.example.demoDb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "employee_payroll")
public class EmployeePayroll implements Serializable {
    private static final long serialVersionUID = 7158675632146148003L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "employee_id")
    private Integer employeeId;

    @Column(name = "ssn")
    private long ssn;

    @Column(name = "salary")
    private long salary;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id",nullable = false)
    private Employee employee;


}
