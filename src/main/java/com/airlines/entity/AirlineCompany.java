package com.airlines.entity;

import com.airlines.interfaces.CompanyInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AirlineCompany implements CompanyInterface {

    private List<Aircraft> aircrafts;

    public AirlineCompany(){
        aircrafts = new ArrayList<Aircraft>();
    }

    public void addAircraft(Aircraft aircraft){
        this.aircrafts.add(aircraft);
    }

    public int getTotalCapacity(){
        int totalCapacity = 0;

        for(Aircraft aircraft: aircrafts){
            totalCapacity += aircraft.getCapacity();
        }

        return totalCapacity;
    }

    public int getTotalCarryingCapacity(){
        int totalCarryingCapacity = 0;

        for(Aircraft aircraft: aircrafts){
            totalCarryingCapacity += aircraft.getCarryingCapacity();
        }

        return totalCarryingCapacity;
    }

    public void sort(){
        Collections.sort(aircrafts);
    }

    public List<Aircraft> getAircraftsByRangeOfConsumption(int minRange,int maxRange){
        List<Aircraft> specifiedAircrafts = new ArrayList<Aircraft>();

        if(minRange>maxRange){
            return specifiedAircrafts;
        }

        for (Aircraft aircraft : aircrafts){
            if(aircraft.getFuelConsumption() >= minRange && aircraft.getFuelConsumption() <= maxRange){
                specifiedAircrafts.add(aircraft);
            }
        }
        return specifiedAircrafts;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Aircraft aircraft: aircrafts){
            stringBuilder.append(aircraft.toString());
        }
        return stringBuilder.toString();
    }
}
