/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.alz.web;

/**
 *
 * @author ryanki1
 */
public class User {
    
    private String loggedOnUserName;

    public String getLoggedOnUserName() {
        return loggedOnUserName;
    }

    public void setLoggedOnUserName(String loggedOnUserName) {
        this.loggedOnUserName = loggedOnUserName;
    }
    private String firstName;
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
}
