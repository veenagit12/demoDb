package com.example.demoDb.controller;

import com.example.demoDb.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demoDb.repository.CarRepository;

import java.util.List;
import java.util.Optional;

@RestController

public class CarController
{
    @Autowired
    private CarRepository carRepository;
    @GetMapping(value ="/car")
    public List<Car> getCars()
    {
        /* Car c1 = new Car();
        c1.setColor("White");
        c1.setName("Honda CRV"); */

        return carRepository.findAll();
    }
    @PostMapping(value ="/car")
    public Car addNewCar(@RequestBody Car c1)
    {
        return carRepository.save(c1);
       //return "New Car Added with name "+c1.getName() + "and color "+ c1.getColor();
    }
    @GetMapping(value ="/car/{carName}")
    public Car getCarByName(@PathVariable String carName)
    {
        Optional<Car> optional = carRepository.findByName(carName);
        return optional.isPresent() ? optional.get() : new Car();
    }
    // optional will write default null values if that car is not present
}
