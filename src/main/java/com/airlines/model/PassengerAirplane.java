package com.airlines.model;

public class PassengerAirplane extends Airplane{

    private static final int CAPACITY = 250;
    private static final int CARRYING_CAPACITY = 50;

    public PassengerAirplane(String name, int flightRange,int fuelConsumption){
        super(name,CAPACITY,CARRYING_CAPACITY,flightRange,fuelConsumption);
    }
}
