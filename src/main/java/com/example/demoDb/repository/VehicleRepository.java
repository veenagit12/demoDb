package com.example.demoDb.repository;

import com.example.demoDb.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer>{
}
