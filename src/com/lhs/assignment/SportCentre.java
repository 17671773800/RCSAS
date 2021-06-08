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
public class SportCentre {
    private String sportCentreID;
    private String sportCentreName;
    private String sportCentreLoc;
    
//    public SportCentre(){
//        this("default","default","default");
//    }
    public SportCentre(String sportCentreID, String sportCentreName, String sportCentreLoc){ //super()
        this.sportCentreID = sportCentreID;  
        this.sportCentreName = sportCentreName;
        this.sportCentreLoc = sportCentreLoc;
    }
    public String toString(){
        return sportCentreID + "\t" + sportCentreName + "\t" + sportCentreLoc;
    }
    public String getSportCentreID() {
        return sportCentreID;
    }

    /**
     * @param sportCentreID the sportCentreID to set
     */
    public void setSportCentreID(String sportCentreID) {
        this.sportCentreID = sportCentreID;
    }

    /**
     * @return the sportCentreName
     */
    public String getSportCentreName() {
        return sportCentreName;
    }

    /**
     * @param sportCentreName the sportCentreName to set
     */
    public void setSportCentreName(String sportCentreName) {
        this.sportCentreName = sportCentreName;
    }

    /**
     * @return the sportCentreLoc
     */
    public String getSportCentreLoc() {
        return sportCentreLoc;
    }

    /**
     * @param sportCentreLoc the sportCentreLoc to set
     */
    public void setSportCentreLoc(String sportCentreLoc) {
        this.sportCentreLoc = sportCentreLoc;
    }
    
}
