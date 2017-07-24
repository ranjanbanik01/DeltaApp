package com.cognizant.deltaapp.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class FlightStatus {
    @Element
    private String airlinecode;
    @Element
    private String flightnumber;
    @Element
    private String todaydate;
    @Element
    private String flightorigindate;
    @Element
    private String retrieveamenities;
    @Element
    private String retrieveflightperformance;
    @Element
    private String retrieveflightposition;
    @Element
    private String retrieveflightusingsameplane;

    public FlightStatus(String airlinecode, String flightnumber, String todaydate, String flightorigindate, String retrieveamenities, String retrieveflightperformance, String retrieveflightposition, String retrieveflightusingsameplane) {
        this.airlinecode = airlinecode;
        this.flightnumber = flightnumber;
        this.todaydate = todaydate;
        this.flightorigindate = flightorigindate;
        this.retrieveamenities = retrieveamenities;
        this.retrieveflightperformance = retrieveflightperformance;
        this.retrieveflightposition = retrieveflightposition;
        this.retrieveflightusingsameplane = retrieveflightusingsameplane;
    }

    public String getAirlinecode() {
        return airlinecode;
    }

    public void setAirlinecode(String airlinecode) {
        this.airlinecode = airlinecode;
    }

    public String getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(String flightnumber) {
        this.flightnumber = flightnumber;
    }

    public String getTodaydate() {
        return todaydate;
    }

    public void setTodaydate(String todaydate) {
        this.todaydate = todaydate;
    }

    public String getFlightorigindate() {
        return flightorigindate;
    }

    public void setFlightorigindate(String flightorigindate) {
        this.flightorigindate = flightorigindate;
    }

    public String getRetrieveamenities() {
        return retrieveamenities;
    }

    public void setRetrieveamenities(String retrieveamenities) {
        this.retrieveamenities = retrieveamenities;
    }

    public String getRetrieveflightperformance() {
        return retrieveflightperformance;
    }

    public void setRetrieveflightperformance(String retrieveflightperformance) {
        this.retrieveflightperformance = retrieveflightperformance;
    }

    public String getRetrieveflightposition() {
        return retrieveflightposition;
    }

    public void setRetrieveflightposition(String retrieveflightposition) {
        this.retrieveflightposition = retrieveflightposition;
    }

    public String getRetrieveflightusingsameplane() {
        return retrieveflightusingsameplane;
    }

    public void setRetrieveflightusingsameplane(String retrieveflightusingsameplane) {
        this.retrieveflightusingsameplane = retrieveflightusingsameplane;
    }
}
