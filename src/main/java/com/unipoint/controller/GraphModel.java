/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipoint.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author priyamal
 */
public class GraphModel implements Serializable{
    
      public  HashMap<String,graphData> graphData = new HashMap<>();
      public  ArrayList<OutletGraphData> outletList = new ArrayList();

    public HashMap<String, graphData> getGraphData() {
        return graphData;
    }

    public void setGraphData(HashMap<String, graphData> graphData) {
        this.graphData = graphData;
    }

    public ArrayList<OutletGraphData> getOutletList() {
        return outletList;
    }

    public void setOutletList(ArrayList<OutletGraphData> outletList) {
        this.outletList = outletList;
    }
      
      
      
}
