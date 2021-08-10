package com.example.demoDb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class CarTemp {
    @EmbeddedId
    private CarId id;

    private String color;
    private int engineCapacity;
    private String brandName;
}
