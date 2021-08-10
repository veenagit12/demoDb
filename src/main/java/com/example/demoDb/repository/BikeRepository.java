package com.example.demoDb.repository;

import com.example.demoDb.entity.Bike;
import com.example.demoDb.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike,Integer> {
}
