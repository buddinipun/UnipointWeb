package com.unipoint.controller;

import com.unipoint.controller.userSession.CurrentUser;
import com.unipoint.controller.userSession.UserPriviledges;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 *
 * @author priyamal
 */
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

    String ROLE = "";
    String allowedUrl1 = "/UnipointWeb/";
    String allowedUrl2 = "/UnipointWeb/logout";
    String allowedUrl3 = "/UnipointWeb/login";
    String allowedUrl4 = "/UnipointWeb/noaccess";
    
    CurrentUser loggedInUser = null;
    
    @Autowired
    UserPriviledges priviledges;
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        
        //theses urls are acessible by anyone, no need to login
        if (uri.equals(allowedUrl1) || uri.equals(allowedUrl2) || uri.equals(allowedUrl3) || uri.equals(allowedUrl4)) {
            return true;
        }
        
        //resources and uploads folder is accessible to anyone
        if (uri.contains("uploads") || uri.contains("resources")) {
            System.out.println("trying to access resources");
            return true;
        }
        
        //user is trying to access another url
        if (request.getSession().getAttribute("loguser")!=null) {
            loggedInUser = (CurrentUser)request.getSession().getAttribute("loguser");
            ROLE = loggedInUser.getLoggedInUser().getData().getUser().getRoles().get(0).getName();
            if (ROLE.equalsIgnoreCase("Admin")) {
                return true;
            }else if (ROLE.equals("Merchant admin")) {
              if (priviledges.checkInMerchantAdmin(uri)) {return true;}else{response.sendRedirect("noaccess");}
            }else if (ROLE.equals("Outlet Manager")) {
              if (priviledges.checkInOutletManager(uri)) {return true;}else{response.sendRedirect("noaccess");}  
            }else if (ROLE.equals("Outlet Cashier")) {
              if (priviledges.checkInOutletCashierPriviledge(uri)) {return true;}else{response.sendRedirect("noaccess");}  
            }
            
        
        }else{
            response.sendRedirect("login");
        }  
        return true;
    }

}