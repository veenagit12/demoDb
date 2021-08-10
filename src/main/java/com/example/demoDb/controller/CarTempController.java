package com.example.demoDb.controller;

import com.example.demoDb.entity.Car;
import com.example.demoDb.entity.CarTemp;
import com.example.demoDb.repository.CarRepository;
import com.example.demoDb.repository.CarTempRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@RestController

public class CarTempController
{
    @Autowired
    private CarTempRepository carTempRepository;
    @GetMapping(value ="/carTemp",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CarTemp> getCarTemps()
    {

        return carTempRepository.findAll();
    }
    @PostMapping(value ="/carTemp",produces = MediaType.APPLICATION_JSON_VALUE)
    public CarTemp addNewCarTemp(@RequestBody CarTemp c1)
    {
        return carTempRepository.save(c1);
    }



}
