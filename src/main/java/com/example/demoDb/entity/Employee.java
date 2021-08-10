package com.example.demoDb.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.mapping.Set;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee implements Serializable
{
    private static final long serialVersionUID = -827016060425383632L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = " first_name")
    private String firstName;

    @OneToOne @MapKeyColumn
    private EmployeePayroll employeePayroll;

}
