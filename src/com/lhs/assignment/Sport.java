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
public class Sport extends SportCentre{ //class name
    private String sportID; //attribute
    private String sportName;
    
    public Sport (String sportID, String sportName, String sportCentreID, String sportCentreName, String sportCentreLoc){ //method (constructor) (under method)
        super(sportCentreID, sportCentreName, sportCentreLoc);
        this.sportID = sportID;
        this.sportName = sportName;
    }
    public String toString (){
        return sportID + "\t" + sportName+"\t"+super.toString();  //super.toString: call SportCentre toString (line 25) 
    }

}
