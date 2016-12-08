/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipoint.controller.userSession;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;

/**
 *
 * @author priyamal
 */
@Controller
public class SessionManagement {
    
    public CurrentUser getCurrentUser(HttpSession session){
        if (session.getAttribute("loguser")!=null) {
            return  (CurrentUser)session.getAttribute("loguser");
        }
        CurrentUser loggedUser = new CurrentUser();
        session.setAttribute("loguser",loggedUser);
        return loggedUser;
    }
    
}
