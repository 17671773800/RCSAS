/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lhs.assignment;

/**
 *
 * @author User
 */
public class Schedule extends Sport{
    private String scheduleID;
    private String day; //dayofweek
    private String duration; //7-9
    
    public Schedule (String scheduleID,String day, String duration, String sportID, String sportName, String sportCentreID, String sportCentreName, String sportCentreLoc){ 
        super(sportID, sportName, sportCentreID, sportCentreName, sportCentreLoc);
        this.scheduleID = scheduleID;
        this.day = day;
        this.duration = duration;
    }
    public String toString (){
        return scheduleID + "\t" + day + "\t" + duration +"\t"+super.toString();  
    }
}
