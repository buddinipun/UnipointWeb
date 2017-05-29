/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipoint.controller.userSession;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;

/**
 *
 * @author priyamal
 */
@Controller
public class UserPriviledges {
    
    
    public ArrayList<String> merchantAdminPriviledges = new ArrayList();
    public ArrayList<String> outletManagerPriviledges = new ArrayList();
    public ArrayList<String> outletCashierPriviledges = new ArrayList();

    public UserPriviledges() {
    //adding to merchantUser
    merchantAdminPriviledges.add("/Outlet");
    merchantAdminPriviledges.add("/Schema");
    merchantAdminPriviledges.add("/ActiveInactive");
    merchantAdminPriviledges.add("/BuzzedMe");
    merchantAdminPriviledges.add("/Offer");
    //adding to outletmanager    
    outletManagerPriviledges.add("/Offer");
    outletManagerPriviledges.add("/ActiveInactive");
    outletManagerPriviledges.add("/BuzzedMe");
    //outletCashier
    outletCashierPriviledges.add("/ActiveInactive");
    }
    
    
    public boolean checkInMerchantAdmin(String uri){
        for (String merchantAdminPriviledge : merchantAdminPriviledges) {
            if (uri.contains(merchantAdminPriviledge)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean checkInOutletManager(String uri){
        for (String outletManagerPriviledge : outletManagerPriviledges) {
            if (uri.contains(outletManagerPriviledge)) {
                return true;
            }
        }
        return false;
    }
    
    
    public boolean checkInOutletCashierPriviledge(String uri){
        for (String outletcashierPriviledge : outletCashierPriviledges) {
            if (uri.contains(outletcashierPriviledge)) {
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
}
