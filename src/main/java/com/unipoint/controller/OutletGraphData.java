/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipoint.controller;

import com.unipoint.model.Outlet;
import com.unipoint.model.UnipointCustomerProfile;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author priyamal
 */
public class OutletGraphData implements  Serializable{

    HashMap<String, graphData> graphdata = new HashMap<>();
    Outlet outlet = new Outlet();
    int outletcount = 0;
    
    public OutletGraphData() {
        graphdata.put("le17", new graphData(13));
        graphdata.put("le24", new graphData(18));
        graphdata.put("le34", new graphData(25));
        graphdata.put("le44", new graphData(35));
        graphdata.put("le54", new graphData(45));
        graphdata.put("le64", new graphData(55));
        graphdata.put("ge65", new graphData(65));
    }

    public HashMap<String, graphData> getGraphdata() {
        return graphdata;
    }

    public void setGraphdata(HashMap<String, graphData> graphdata) {
        this.graphdata = graphdata;
    }

    public Outlet getOutlet() {
        return outlet;
    }

    public void setOutlet(Outlet outlet) {
        this.outlet = outlet;
    }

    @Override
    public boolean equals(Object object) {
        OutletGraphData data = (OutletGraphData)object;
        if (data.getOutlet().getOutletid()==this.getOutlet().getOutletid()) {
        return true;
        }
        return false;
    }
    
    public void addTORelatedAge(UnipointCustomerProfile customer){
                        Date date = customer.getBirthdate();
                        LocalDate birthdate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                        long years = birthdate.until(LocalDate.now(), ChronoUnit.YEARS);
                        String Gender = customer.getGender();
                        Gender = Gender.replaceAll("\\s","");
                        if (years>=13&&years<17) {
                        int data =  Gender.equals("Male")? graphdata.get("le17").incrementMaleCount() : graphdata.get("le17").incrementFeMaleCount();
                        }else if (years>=18&&years<24) {
                        int data =  Gender.equals("Male")? graphdata.get("le24").incrementMaleCount() : graphdata.get("le24").incrementFeMaleCount();    
                        }else if (years>=25&&years<34) {
                        int data =  Gender.equals("Male")? graphdata.get("le34").incrementMaleCount() : graphdata.get("le34").incrementFeMaleCount();
                        }else if (years>=35&&years<44) {
                        int data =  Gender.equals("Male")? graphdata.get("le44").incrementMaleCount() : graphdata.get("le44").incrementFeMaleCount();    
                        }else if (years>=45&&years<54) {
                        int data =  Gender.equals("Male")? graphdata.get("le54").incrementMaleCount() : graphdata.get("le54").incrementFeMaleCount();    
                        }else if (years>=55&&years<64) {
                        int data =  Gender.equals("Male")? graphdata.get("le64").incrementMaleCount() : graphdata.get("le64").incrementFeMaleCount();
                        }else if(years <= 65){
                        int data =  Gender.equals("Male")? graphdata.get("ge65").incrementMaleCount() : graphdata.get("ge65").incrementFeMaleCount();
                        }
        }
    
    public void calculatePercentages(){
        for (graphData value : graphdata.values()) {
            value.calculatePercentage(outletcount);
        }   
    }

    public int getOutletcount() {
        return outletcount;
    }

    public void setOutletcount(int outletcount) {
        this.outletcount = outletcount;
    }
    
    public void incrementOutletcount(){
    ++outletcount;
    }
    
}
