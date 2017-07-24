package com.cognizant.deltaapp.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class FlightStatusRequestByLeg {
    @Element
    private RequestInfo requestInfo;
    @Element
    private FlightStatusByLeg flightStatusByLeg;

    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(RequestInfo requestInfo) {
        this.requestInfo = requestInfo;
    }

    public FlightStatusByLeg getFlightStatusByLeg() {
        return flightStatusByLeg;
    }

    public void setFlightStatusByLeg(FlightStatusByLeg flightStatusByLeg) {
        this.flightStatusByLeg = flightStatusByLeg;
    }
}
