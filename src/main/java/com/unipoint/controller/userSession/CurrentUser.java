/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipoint.controller.userSession;

import com.unipoint.model.Role.Result.Result;
import java.io.Serializable;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

public class CurrentUser implements Serializable{
   
    Result currentUser = new Result();
    
    public void setLoggedInUser(Result result){
    currentUser = result;
    }
    
    public Result getLoggedInUser(){
    return currentUser;
    }
    
    
}


