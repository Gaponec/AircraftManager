package com.airlines.model;

public class CargoAirplane extends Airplane{

    private static final int CAPACITY = 200;
    private static final int CARRYING_CAPACITY = 150;

    public CargoAirplane(String name, int flightRange,int fuelConsumption){
        super(name,CAPACITY,CARRYING_CAPACITY,flightRange,fuelConsumption);
    }
}
