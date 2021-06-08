package com.hxf.registeredSportSchedule;

public class RegisteredSportSchedule {

    private String studentID;
    private String studentName;
    private String coachName;
    private String sportCode;
    private String sportName;
    private String sportAddress;
    private String scheduleDate;


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getSportCode() {
        return sportCode;
    }

    public void setSportCode(String sportCode) {
        this.sportCode = sportCode;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSportAddress() {
        return sportAddress;
    }

    public void setSportAddress(String sportAddress) {
        this.sportAddress = sportAddress;
    }

    @Override
    public String toString() {
        return "RegisteredSportSchedule{" +
                "studentName='" + studentName + '\'' +
                ", coachName='" + coachName + '\'' +
                ", sportCode='" + sportCode + '\'' +
                ", sportName='" + sportName + '\'' +
                ", scheduleDate='" + scheduleDate + '\'' +
                '}';
    }
}
