package com.hxf.entity;

import com.hxf.student.Student;

public class DetailsOfSport  extends Student {
    private String sportId;
    private String sportName;
    private String sportCenterID;
    private String SportCenterID;
    private String sportCenterAddress;

    public String getSportId() {
        return sportId;
    }

    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getSportCenterID() {
        return sportCenterID;
    }

    public void setSportCenterID(String sportCenterID) {
        this.sportCenterID = sportCenterID;
    }

    public String getSportCenterAddress() {
        return sportCenterAddress;
    }

    public void setSportCenterAddress(String sportCenterAddress) {
        this.sportCenterAddress = sportCenterAddress;
    }
}
