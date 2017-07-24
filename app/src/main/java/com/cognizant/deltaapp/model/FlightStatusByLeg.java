package com.cognizant.deltaapp.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class FlightStatusByLeg {
    @Element
    private String airlinecode;
    @Element
    private String flightnumber;
    @Element
    private String todaydate;
    @Element
    private String legdeparturedate;
    @Element
    private String legdepartureairportcode;
    @Element
    private String legarrivalairportcode;
    @Element
    private String amenitiescabincode;
    @Element
    private String retrieveamenities;
    @Element
    private String retrieveflightperformance;
    @Element
    private String retrieveflightposition;
    @Element
    private String retrieveflightusingsameplane;
    @Element
    private String limitbyairportcodes;

    public FlightStatusByLeg(String airlinecode, String flightnumber, String todaydate, String legdeparturedate, String legdepartureairportcode, String legarrivalairportcode, String amenitiescabincode, String retrieveamenities, String retrieveflightperformance, String retrieveflightposition, String retrieveflightusingsameplane, String limitbyairportcodes) {
        this.airlinecode = airlinecode;
        this.flightnumber = flightnumber;
        this.todaydate = todaydate;
        this.legdeparturedate = legdeparturedate;
        this.legdepartureairportcode = legdepartureairportcode;
        this.legarrivalairportcode = legarrivalairportcode;
        this.amenitiescabincode = amenitiescabincode;
        this.retrieveamenities = retrieveamenities;
        this.retrieveflightperformance = retrieveflightperformance;
        this.retrieveflightposition = retrieveflightposition;
        this.retrieveflightusingsameplane = retrieveflightusingsameplane;
        this.limitbyairportcodes = limitbyairportcodes;
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

    public String getLegdeparturedate() {
        return legdeparturedate;
    }

    public void setLegdeparturedate(String legdeparturedate) {
        this.legdeparturedate = legdeparturedate;
    }

    public String getLegdepartureairportcode() {
        return legdepartureairportcode;
    }

    public void setLegdepartureairportcode(String legdepartureairportcode) {
        this.legdepartureairportcode = legdepartureairportcode;
    }

    public String getLegarrivalairportcode() {
        return legarrivalairportcode;
    }

    public void setLegarrivalairportcode(String legarrivalairportcode) {
        this.legarrivalairportcode = legarrivalairportcode;
    }

    public String getAmenitiescabincode() {
        return amenitiescabincode;
    }

    public void setAmenitiescabincode(String amenitiescabincode) {
        this.amenitiescabincode = amenitiescabincode;
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

    public String getLimitbyairportcodes() {
        return limitbyairportcodes;
    }

    public void setLimitbyairportcodes(String limitbyairportcodes) {
        this.limitbyairportcodes = limitbyairportcodes;
    }

}
