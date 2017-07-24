package com.cognizant.deltaapp.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by 262966 on 7/24/2017.
 */
@Root
public class FlightSchedulesRequest {
    @Element
    private RequestInfo requestInfo;
    @Element
    private Schedules schedules;

    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(RequestInfo requestInfo) {
        this.requestInfo = requestInfo;
    }

    public Schedules getSchedules() {
        return schedules;
    }

    public void setSchedules(Schedules schedules) {
        this.schedules = schedules;
    }
}
