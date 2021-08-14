package com.example.demoDb.repository;

import com.example.demoDb.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Integer> {

    List<Project> findByProjectId(Integer projectId);
}
