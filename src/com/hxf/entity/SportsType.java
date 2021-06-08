package com.hxf.entity;

import com.hxf.student.Student;

public class SportsType  extends Student {
    // Swimming, Badminton, Football, Archery, Gymnastics, Volleyball, Basketball, Cricket, Tennis and Table Tennis
    public static int SWIMMING = 0;
    public static int BADMINTON = 1;
    public static int FOOTBALL = 2;
    public static int ARCHERY = 3;
    public static int GYMNASTICS = 4;
    public static int VOLLEYBALL = 5;
    public static int BASKETBALL = 6;
    public static int CRICKET = 7;
    public static int TENNIS = 8;
    public static int TABLE_TENNIS = 9;

    @Override
    public String toString() {
        return "SportsType{" +
                "SWIMMING=" + SWIMMING +
                ", BADMINTON=" + BADMINTON +
                ", FOOTBALL=" + FOOTBALL +
                ", ARCHERY=" + ARCHERY +
                ", GYMNASTICS=" + GYMNASTICS +
                ", VOLLEYBALL=" + VOLLEYBALL +
                ", BASKETBALL=" + BASKETBALL +
                ", CRICKET=" + CRICKET +
                ", TENNIS=" + TENNIS +
                ", TABLE_TENNIS=" + TABLE_TENNIS +
                '}';
    }
}
