package com.airlines.hanlder;

import com.airlines.entity.AirlineCompany;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CommandHandler {
    public static final String DISPLAY_CARRYING_CAPACITY = "dcc";
    public static final String DISPLAY_CAPACITY = "dc";
    public static final String DISPLAY_SORTED_BY_FLIGHT_RANGE = "dsr";
    public static final String DISPLAY_WITH_RANGE = "dwr";
    public static final String EXIT_PROGRAMME = "exit";

    private static final String ERR_UNSIGNED_PARAM = "Undefined parameter";

    private boolean shouldExit;
    private AirlineCompany airlineCompany;

    public CommandHandler(AirlineCompany airlineCompany){
        this.airlineCompany = airlineCompany;
        this.shouldExit = false;
    }

    public void handleCommand(String command){
        if(command.isEmpty()){
            return;
        }

        LinkedList<String> params = new LinkedList<>(Arrays.asList(command.split(" ")));
        String controlCommand = params.getFirst();

        params.removeFirst();

        switch (controlCommand){
            case DISPLAY_CAPACITY:
                displayCapacity(params);
                return;

            case DISPLAY_CARRYING_CAPACITY:
                displayCarryingCapacity(params);
                return;

            case DISPLAY_SORTED_BY_FLIGHT_RANGE:
                displaySorted(params);
                return;

            case DISPLAY_WITH_RANGE:
                displayWithRange(params);
                return;

            case EXIT_PROGRAMME:
                exit();
                return;

            default:
                error(ERR_UNSIGNED_PARAM);
                return;
        }
    }

    private void displayCapacity(LinkedList<String> params){
        if(!params.isEmpty()) {
            error(ERR_UNSIGNED_PARAM);
            return;
        }

        System.out.println("Total capacity " + airlineCompany.getTotalCapacity());
    }

    private void displayCarryingCapacity(LinkedList<String> params){
        if(!params.isEmpty()) {
            error(ERR_UNSIGNED_PARAM);
            return;
        }

        System.out.println("Total carrying capacity " + airlineCompany.getTotalCarryingCapacity());
    }

    private void displaySorted(LinkedList<String> params){
        if(!params.isEmpty()) {
            error(ERR_UNSIGNED_PARAM);
            return;
        }

        airlineCompany.sort();
        System.out.println("Sorted by flight range list of aircraft" + airlineCompany.toString());
    }

    private void displayWithRange(LinkedList<String> params){
        if(params.size() > 2){
            error(ERR_UNSIGNED_PARAM);
            return;
        }

        int min = Integer.valueOf(params.getFirst());
        int max = Integer.valueOf(params.getLast());

        System.out.println(
                airlineCompany.getAircraftsByRangeOfConsumption(min,max).toString()
        );


    }

    private void error(String err){
        System.out.println(err);
    }

    private void exit(){
        this.shouldExit = true;
    }

    public boolean shouldExit(){
        return this.shouldExit;
    }
}
