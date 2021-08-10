package com.example.demoDb.repository;

import com.example.demoDb.entity.CarId;
import com.example.demoDb.entity.CarTemp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarTempRepository extends JpaRepository<CarTemp, CarId> {
}
