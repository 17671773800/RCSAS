/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lhs.Search;

import com.lhs.Disp.Display;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Search {
    private String searchByCID; //attribute
    private static ArrayList <Display> SearchList = new  ArrayList <>();
    
    public Search (String searchByCID){
        this.searchByCID = searchByCID;
    }
    public String toString(){
        return searchByCID;
    }
    public static ArrayList<Display> getSearchList() {
        return SearchList;
    }
}
