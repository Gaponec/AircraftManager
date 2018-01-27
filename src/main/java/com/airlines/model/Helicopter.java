package com.airlines.model;

import com.airlines.entity.Aircraft;

public class Helicopter extends Aircraft {

    public Helicopter(String name, int capacity, int carryingCapacity, int flightRange,int fuelConsumption){
        super(name,capacity,carryingCapacity,flightRange,fuelConsumption);
    }
}
