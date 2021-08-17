package com.example.demoDb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee implements Serializable
{
    private static final long serialVersionUID = -827016060425383632L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = " first_name")
    private String firstName;


    //@OneToOne @MapKeyColumn
    //private EmployeePayroll employeePayroll;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id",nullable = false)
    private EmployeePayroll employeePayroll;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable(name = "assignment",
            joinColumns = {@JoinColumn(name ="employee_id")},
            inverseJoinColumns = {@JoinColumn(name = "project_id")})

    private Set<Project> projects = new HashSet<>();


    }


