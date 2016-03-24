package com.Heather;

import java.util.*;

/**
 * Created by cryst on 3/24/2016.
 */
public class WaterHeater extends ServiceCall{
    private int age;
    final static Double wfee=20.00;

    public WaterHeater(String serviceAddress, String problemDescription, Date date, int age) {
        super(serviceAddress, problemDescription, date);
        this.age=age;
    }

    @Override
    public String toString() {

        //These statements use the Java ternary operator
        //This says "if resolvedDate == null, then set resolvedDate to "Unresolved". Otherwise, set resolvedDate to resolvedDate.toString()
        //Same logic as an if-else statment, but more consise if the condition is simple and the if statment's task is
        //to set the value of a variable based on a condition being true or false.
        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);
        String wfeeString=(wfee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(wfee);


        return "Water Heater Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Service Charge Fee = " + feeString + "\n" +
                "Water Heater Fee = " + wfeeString;

    }
}
