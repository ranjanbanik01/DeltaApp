package com.cognizant.deltaapp.Builder;

/**
 * Created by 262966 on 7/19/2017.
 */

import com.cognizant.deltaapp.model.FlightStatusByLeg;
import com.cognizant.deltaapp.model.FlightStatusRequestByLeg;
import com.cognizant.deltaapp.model.RequestInfo;

/**
 * It is not created as per Standard Builder pattern, as it may not
 * be needed later; It is a mock DeltaXMRequest generator
 */
public class DeltaRequestBuilder {
    public static FlightStatusRequestByLeg buildStatusRequestByLeg(){
        FlightStatusRequestByLeg req = new FlightStatusRequestByLeg();

        FlightStatusByLeg fsbl = new FlightStatusByLeg("DL",
                                                        "2299",
                                                        "2017-07-17",
                                                        "2017-07-17",
                                                        "LGA",
                                                        "ATL",
                                                        "Y",
                                                        "true",
                                                        "true",
                                                        "true",
                                                        "true",
                                                        "true");

        RequestInfo reqInfo = new RequestInfo("1.0",
                                                "mobile",
                                                "IPHONE",
                                                "iOS",
                                                "1.0",
                                                 "12345",
                                                "prod",
                                                "5564734",
                                                "1",
                                                "123",
                                                "Phone");
        req.setFlightStatusByLeg(fsbl);
        req.setRequestInfo(reqInfo);

        return req;
    }
}
