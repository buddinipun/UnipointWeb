/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipoint.controller;

import java.io.Serializable;

/**
 *
 * @author priyamal
 */
public  class graphData  implements Serializable{         
        int age = 0;
        public int malecount = 0;
        public int femalecount = 0;
        public String percentage = "0.0%";
        
        
        public graphData(int age) {
        this.age = age;
        }

        public int getMalecount() {
            return malecount;
        }

        public void setMalecount(int malecount) {
            this.malecount = malecount;
        }

        public int getFemalecount() {
            return femalecount;
        }

        public void setFemalecount(int femalecount) {
            this.femalecount = femalecount;
        }

        public int incrementMaleCount(){
            ++malecount;
            return malecount;
        }
        
        public int incrementFeMaleCount(){
            ++femalecount;
            return femalecount;
        }

    public String getPercentage() {
        return percentage;
    }

    public void calculatePercentage(double totalCount) {
        double count = malecount+femalecount;
        double percentage = count/totalCount;
        percentage = percentage*100;
        this.percentage = String.format("%.2f", percentage);
    }

    
}
       
