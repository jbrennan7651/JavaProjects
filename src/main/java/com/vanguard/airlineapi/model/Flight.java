package com.vanguard.airlineapi.model;

public class Flight{
    //
    //Data Members
    //
    private String flightNumber;
    private String origin;
    private String destination;

    //
    //Constructor
    //

    public Flight(String flightNumber, String origin, String destination) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
    }


    //
    //Accessors
    //

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}