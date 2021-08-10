package com.example.demoDb.controller;

import com.example.demoDb.entity.Vehicle;
import com.example.demoDb.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {
    @Autowired
    VehicleRepository vehicleRepository;
    @GetMapping(value ="/vehicle")
    public List<Vehicle> getVehicles()
    {
        return vehicleRepository.findAll();
    }

    @PostMapping(value = "/vehicle")
    public Vehicle addNewVehicle(@RequestBody Vehicle v1)
    {
        return vehicleRepository.save(v1);
    }
}
