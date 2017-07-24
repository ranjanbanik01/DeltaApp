package com.cognizant.deltaapp.model;

import org.simpleframework.xml.Element;

public class Schedules {
    @Element
    private String todaydate;
    @Element
    private String departuredate;
    @Element
    private String departureairportcode;
    @Element
    private String arrivalairportcode;
    @Element
    private String departuretime;
    @Element
    private String skdendrecord;

    public Schedules(String todaydate, String departuredate, String departureairportcode, String arrivalairportcode, String departuretime, String skdendrecord) {
        this.todaydate = todaydate;
        this.departuredate = departuredate;
        this.departureairportcode = departureairportcode;
        this.arrivalairportcode = arrivalairportcode;
        this.departuretime = departuretime;
        this.skdendrecord = skdendrecord;
    }

    public String getTodaydate() {
        return todaydate;
    }

    public void setTodaydate(String todaydate) {
        this.todaydate = todaydate;
    }

    public String getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(String departuredate) {
        this.departuredate = departuredate;
    }

    public String getDepartureairportcode() {
        return departureairportcode;
    }

    public void setDepartureairportcode(String departureairportcode) {
        this.departureairportcode = departureairportcode;
    }

    public String getArrivalairportcode() {
        return arrivalairportcode;
    }

    public void setArrivalairportcode(String arrivalairportcode) {
        this.arrivalairportcode = arrivalairportcode;
    }

    public String getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public String getSkdendrecord() {
        return skdendrecord;
    }

    public void setSkdendrecord(String skdendrecord) {
        this.skdendrecord = skdendrecord;
    }
}
