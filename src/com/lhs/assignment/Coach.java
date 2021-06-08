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
public class Coach extends Sport {
    private String coachID;
    private String coachName;
    private double payRate;
    private String email;
    private String hpNo;
    private double rating;
    
    public Coach (String coachID,String coachName, double payRate, String email, String hpNo, double rating,
            String sportID, String sportName, String sportCentreID, String sportCentreName, String sportCentreLoc) {
        super(sportID, sportName, sportCentreID, sportCentreName,sportCentreLoc);
        this.coachID = coachID;
        this.coachName = coachName;   
        this.payRate = payRate;
        this.email = email;
        this.hpNo = hpNo;
        this.rating = rating;
    }
    public String toString(){ 
        return coachID +"\t" + coachName + "\t" + payRate + "\t" + email + "\t" + hpNo + "\t" +rating +"\t"+super.toString();
    }

    /**
     * @return the coachName
     */          
    public String getCoachName() {
        return coachName;
    }

    /**
     * @param coachName the sportCentreID to set
     */
    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    /**
     * @return the payRate
     */
    public double getpayRate() {
        return payRate;
    }

    /**
     * @param payRate the sportCentreName to set
     */
    public void setpayRate(double payRate) {
        this.payRate = payRate;
    }

    /**
     * @return the email
     */
    public String getemail() {
        return email;
    }

    /**
     * @param email the sportCentreLoc to set
     */
    public void setemail(String email) {
        this.email = email;
    }
    
     /**
     * @return the hpNo
     */   
    public String gethpNo() {
        return hpNo;
    }

    /**
     * @param hpNo the sportCentreLoc to set
     */
    public void sethpNo(String hpNo) {
        this.hpNo = hpNo;
    }    
}
