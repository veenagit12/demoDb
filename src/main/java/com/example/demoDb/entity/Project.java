package com.example.demoDb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "project")
public class Project implements Serializable {

    private static final long serialVersionUID = 8532117018719069674L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="project_id")
    private Integer projectId;

    @Column(name ="project_name")
    private String projectName ;

    @Column(name ="project_description")
    private String projectDescription;

    @Column(name ="start_date")
    private Date startDate = new Date();

    @Column(name ="end_date")
    private Date endDate = new Date();

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY,cascade =CascadeType.ALL,mappedBy = "projects")
    private Set<Employee> employees = new HashSet<>();


}
