package com.hxf.coach;

import com.hxf.student.Student;

public class Coach extends Student {
    // Swimming, Badminton, Football, Archery, Gymnastics, Volleyball, Basketball, Cricket, Tennis and Table Tennis
    private String CoachId;
    private String CoachName;
    private String JoinDate;
    private String LeaveDate;
    private String RatePerHour;
    private String CoachPhone;
    private String CoachAddress;
    private String SportCenterID;
    private String SportName;
    private String CoachEvaluate;
    private String CoachEmial;
    private String SportID;
    private String SportCenterAddress;

    public String getCoachId() {
        return CoachId;
    }

    public void setCoachId(String coachId) {
        CoachId = coachId;
    }

    public String getCoachName() {
        return CoachName;
    }

    public void setCoachName(String coachName) {
        CoachName = coachName;
    }

    public String getJoinDate() {
        return JoinDate;
    }

    public void setJoinDate(String joinDate) {
        JoinDate = joinDate;
    }

    public String getLeaveDate() {
        return LeaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        LeaveDate = leaveDate;
    }

    public String getRatePerHour() {
        return RatePerHour;
    }

    public void setRatePerHour(String ratePerHour) {
        RatePerHour = ratePerHour;
    }

    public String getCoachPhone() {
        return CoachPhone;
    }

    public void setCoachPhone(String coachPhone) {
        CoachPhone = coachPhone;
    }

    public String getCoachAddress() {
        return CoachAddress;
    }

    public void setCoachAddress(String coachAddress) {
        CoachAddress = coachAddress;
    }



    public String getSportCenterID() {
        return SportCenterID;
    }

    public void setSportCenterID(String SportCenterID) {
        this.SportCenterID = SportCenterID;
    }

    public String getSportName() {
        return SportName;
    }

    public void setSportName(String sportName) {
        SportName = sportName;
    }

    public String getCoachEvaluate() {
        return CoachEvaluate;
    }

    public void setCoachEvaluate(String coachEvaluate) {
        CoachEvaluate = coachEvaluate;
    }

    public String getCoachEmial() {
        return CoachEmial;
    }

    public void setCoachEmial(String coachEmial) {
        CoachEmial = coachEmial;
    }

    public String getSportID() {
        return SportID;
    }

    public void setSportID(String sportID) {
        SportID = sportID;
    }

    public String getSportCenterAddress() {
        return SportCenterAddress;
    }

    public void setSportCenterAddress(String sportCenterAddress) {
        SportCenterAddress = sportCenterAddress;
    }

    @Override
    public String toString() {
        return "coach.Coach{" +
                "CoachId='" + CoachId + '\'' +
                ", CoachName='" + CoachName + '\'' +
                ", JoinDate='" + JoinDate + '\'' +
                ", LeaveDate='" + LeaveDate + '\'' +
                ", RatePerHour='" + RatePerHour + '\'' +
                ", CoachPhone='" + CoachPhone + '\'' +
                ", CoachAddress='" + CoachAddress + '\'' +
                ", SportCenterID='" + SportCenterID + '\'' +
                ", SportName='" + SportName + '\'' +
                ", CoachEvaluate='" + CoachEvaluate + '\'' +
                '}';
    }
}
