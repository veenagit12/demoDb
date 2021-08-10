package com.example.demoDb.controller;

import com.example.demoDb.entity.Bike;
import com.example.demoDb.entity.Car;
import com.example.demoDb.repository.BikeRepository;
import com.example.demoDb.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class BikeController
{
    @Autowired
    private BikeRepository bikeRepository;
    @GetMapping(value ="/bike")
    public List<Bike> getBikes()
    {
        return bikeRepository.findAll();
    }
    @PostMapping(value ="/bike")
    public Bike addNewCar(@RequestBody Bike b1)
    {
        return bikeRepository.save(b1);
    }
}
