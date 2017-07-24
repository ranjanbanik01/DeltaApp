package com.cognizant.deltaapp.Util;

import com.cognizant.deltaapp.model.FlightStatusRequestByLeg;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.StringWriter;

/**
 * Created by 262966 on 7/20/2017.
 */

public class DeltaRequestSerializer {

    public static String getRequestInXML(FlightStatusRequestByLeg reqObject){
        String requestXML = "";
        if(reqObject!=null){
            StringWriter sw = new StringWriter();

            Serializer serializer = new Persister();
            try {
                serializer.write(reqObject, sw);
                requestXML = sw.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return requestXML;
    }
}
