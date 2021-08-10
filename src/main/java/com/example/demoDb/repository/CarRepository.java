package com.example.demoDb.repository;

import com.example.demoDb.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car,Integer> {
   Optional <Car> findByName(String name);

}
