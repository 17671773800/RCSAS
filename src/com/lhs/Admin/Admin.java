/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lhs.Admin;

import com.lhs.Search.Search;
import com.lhs.assignment.Schedule;
import com.lhs.assignment.Coach;
import com.lhs.assignment.Sport;
import com.lhs.assignment.SportCentre;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Admin {
    
//                                  lineCnt           
    public boolean AddSport(String sportName,String sportCentreName){
        int lineCnt=0;
        boolean flag = true;
        SportCentre sportCentre = null;
        try {
            File fh = new File("Sport.txt");
            Scanner scn = new Scanner(fh);
            while (scn.hasNextLine()) { //built-in has next line method, to check have next line anot
                String data = scn.nextLine();
                lineCnt++;
            }
            scn.close();
        } catch (FileNotFoundException e ) {
            System.out.println("An error(read) occurred.");
        }
        try {
            File fh = new File("SportCentre.txt");
            Scanner scn = new Scanner(fh);
            while (scn.hasNextLine()) {
                
                String data = scn.nextLine();
                String [] splitdata = data.split("\t");
                if (sportCentreName.equals(splitdata[1])){   //check the sport centre exist anot
                    sportCentre = new SportCentre(splitdata[0],splitdata[1],splitdata[2]);
                    flag = true;
                }
                else{
                    flag = false;
                }
            }
            scn.close();
        } catch (FileNotFoundException e ) {
            System.out.println("An error(read) occurred.");
        }
        if (flag){                                     //+ then put in txt file (prefix)
            Sport sport = new Sport(Integer.toString(++lineCnt),sportName,sportCentre.getSportCentreID(),sportCentre.getSportCentreName(),sportCentre.getSportCentreLoc());
            try (FileWriter writer = new FileWriter("Sport.txt",true)) {
                writer.write(sport.toString()+"\n");
            }
            catch (IOException ex) {
                System.out.println("An error(save) occurred.");
            }
            return true;
        }
        else{
            return false;
        }
    }
    public boolean AddCoach (String coachName, String payRate, String email, String hpNo,String sport,String sportCentre){
        int lineCnt=1;
        boolean flag = false; //to check sport centre exist anot
        Sport sportTemp = null;
        
        try {
            File fh = new File("Sport.txt");
            Scanner scn = new Scanner(fh);
            while (scn.hasNextLine()) {
                
                String data = scn.nextLine();
                String [] temp = data.split("\t");
                if (temp[1].equals(sport) && temp[3].equals(sportCentre)){
                    sportTemp = new Sport(temp[0],temp[1],temp[2],temp[3],temp[4]);
                    flag = true;
                    break;
                }
                else{
                    flag = false;
                }
            }
            scn.close();
        } catch (FileNotFoundException e ) {
            System.out.println("An error occurred.");
        }
        
        try {
            File fh = new File("Coach.txt");
            Scanner scn = new Scanner(fh);
            while (scn.hasNextLine()) {
                String data = scn.nextLine();
                lineCnt++;
            }
            scn.close();
        } catch (FileNotFoundException e ) {
            System.out.println("An error occurred.");
        }

        if (flag){
            String [] temp = sportTemp.toString().split("\t");
            Coach coach = new Coach(Integer.toString(lineCnt++),coachName,Double.parseDouble(payRate),email,hpNo,0.00,temp[0],temp[1],temp[2],temp[3],temp[4]); //int to string (coach ID)
            try (FileWriter writer = new FileWriter("Coach.txt",true)) {  //true=append, false=write
                writer.write(coach.toString()+"\n");
            }
            catch (IOException ex) {
                System.out.println("An error occurred.");
            }
            return true;
        }
        else{
            return false;
        }
    }
    public boolean AddSchedule (String day, String duration, String sportName, String sportCentreName){ 
        int lineCnt=1;
        boolean flag = false,flag2 = true; //to check sport centre exist anot
        Sport sportTemp = null;
        try {
            File fh = new File("Sport.txt");
            Scanner scn = new Scanner(fh);
            while (scn.hasNextLine()) {
                
                String data = scn.nextLine();
                String [] temp = data.split("\t");
                if (temp[1].equals(sportName) && temp[3].equals(sportCentreName)){
                    sportTemp = new Sport(temp[0],temp[1],temp[2],temp[3],temp[4]);
                    flag = true;
                    break;
                }
                else{
                    flag = false;
                }
            }
            scn.close();
        } catch (FileNotFoundException e ) {
            System.out.println("An error occurred.");
        }
        
        try {
            File fh = new File("Schedule.txt");
            Scanner scn = new Scanner(fh);
            while (scn.hasNextLine()) {
                
                String data = scn.nextLine();
                String [] splitTemp = data.split("\t");
                if (day.equals(splitTemp[1]) && duration.equals(splitTemp[2]) &&sportName.equals(splitTemp[4] )&&sportCentreName.equals(splitTemp[7] )){
                    flag = false;
                    break;
                }
                else{
                    flag2=true;
                }
                lineCnt++;
            }
            scn.close();
        } catch (FileNotFoundException e ) {
            System.out.println("An error occurred.");
        }

        if (flag && flag2 ){
            String [] temp = sportTemp.toString().split("\t");
            Schedule schedule = new Schedule(Integer.toString(lineCnt++),day,duration,temp[0],temp[1],temp[2],temp[3],temp[4]); //int to string (coach ID)
            try (FileWriter writer = new FileWriter("Schedule.txt",true)) {  //true=append, false=write
                writer.write(schedule.toString()+"\n");
            }
            catch (IOException ex) {
                System.out.println("An error occurred.");
            }
            return true;
        }
        else{
            return false;
        }
    }
}
