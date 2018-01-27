package com.airlines.model;

public class CargoHelicopter extends Helicopter{

    private static final int CAPACITY = 150;
    private static final int CARRYING_CAPACITY = 120;

    public CargoHelicopter(String name, int flightRange,int fuelConsumption){
        super(name,CAPACITY,CARRYING_CAPACITY,flightRange,fuelConsumption);
    }
}
