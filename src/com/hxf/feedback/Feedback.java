package com.hxf.feedback;

import com.hxf.student.Student;

public class Feedback extends Student {

    private String coachName;
    private String StudentID;
    private String StudentName;
    private String sportType;
    private String sportName;
    private String feedbackBody;
    private String star;

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getFeedbackBody() {
        return feedbackBody;
    }

    public void setFeedbackBody(String feedbackBody) {
        this.feedbackBody = feedbackBody;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "entity.feedback{" +
                "coachName='" + coachName + '\'' +
                ", StudentID='" + StudentID + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", sportType='" + sportType + '\'' +
                ", sportName='" + sportName + '\'' +
                ", feedbackBody='" + feedbackBody + '\'' +
                ", star='" + star + '\'' +
                '}';
    }
}
