package com.airlines.entity;


import com.airlines.interfaces.AircraftInterface;

public class Aircraft implements Comparable<Aircraft>,AircraftInterface{

    private String name;
    private int capacity;
    private int carryingCapacity;
    private Integer flightRange;
    private int fuelConsumption;

    public Aircraft(String name, int capacity, int carryingCapacity, int flightRange, int fuelConsumption){
        setName(name);
        setCapacity(capacity);
        setCarryingCapacity(carryingCapacity);
        setFlightRange(flightRange);
        setFuelConsumption(fuelConsumption);
    }

    public int compareTo(Aircraft aircraftToCompare) {
        return getFlightRange().compareTo(aircraftToCompare.getFlightRange());
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(" ");
        stringBuilder.append(capacity);
        stringBuilder.append(" ");
        stringBuilder.append(carryingCapacity);
        stringBuilder.append(" ");
        stringBuilder.append(flightRange);
        stringBuilder.append(" ");
        stringBuilder.append(fuelConsumption);

        stringBuilder.append("\n");

        return stringBuilder.toString();
    }


    //GETTERS
    public int getCapacity(){
        return capacity;
    }

    public int getCarryingCapacity(){
        return carryingCapacity;
    }

    public Integer getFlightRange(){
        return flightRange;
    }

    public String getName(){
        return name;
    }

    public int getFuelConsumption(){
        return fuelConsumption;
    }


    //SETTERS
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public void setFlightRange(int flightRange){
        this.flightRange = flightRange;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setFuelConsumption(int fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }
}
