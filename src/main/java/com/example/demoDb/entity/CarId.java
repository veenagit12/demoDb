package com.example.demoDb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter

public class CarId implements Serializable
{
    private long id;
    private String name;

}
