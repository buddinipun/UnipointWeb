package com.unipoint.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unipoint.dao.ReportDemographicDao;
import com.unipoint.model.Outlet;
import com.unipoint.model.Transaction;
import com.unipoint.model.UnipointCustomerProfile;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemograpicController {
	
	@Autowired
	ReportDemographicDao reportdemograpic;
	
	String MALE = "Male";
	
        HashMap<String,graphData> graphData = new HashMap<>();
        ArrayList<OutletGraphData> outletList = new ArrayList();
        
	@RequestMapping(value="/sales",method=RequestMethod.GET)
        @ResponseBody
	public GraphModel  init(Model model,@RequestParam("sdate")String sdate,@RequestParam("edate")String edate){
                outletList.clear();
                graphData.clear();
                graphData.put("le17",new graphData(13));
                graphData.put("le24",new graphData(18));
                graphData.put("le34",new graphData(25));
                graphData.put("le44",new graphData(35));
                graphData.put("le54",new graphData(45));
                graphData.put("le64",new graphData(55));
                graphData.put("ge65",new graphData(65));
                
                findPercentage(sdate,edate);
                
                for (OutletGraphData outletgraph : outletList) {
                outletgraph.calculatePercentages();
                }
                
                GraphModel graphModel = new GraphModel();
                graphModel.setGraphData(graphData);
                graphModel.setOutletList(outletList);
                System.out.println("being executed");
                return graphModel;
	}
        
        public void findPercentage(String s,String e){
                LocalDate currentDate = LocalDate.now();
                LocalDate startDate = LocalDate.parse(s);
                LocalDate endDate =LocalDate.parse(e);
                
                int maleCount = 0;
		int femaleCount = 0;
                List<Transaction> transactionProfiles = reportdemograpic.getTransactionCount();
		LocalDate localDate;
                
                for (Transaction transaction : transactionProfiles) {
                    String[] timeStamp = transaction.getAddedDateTime().split(" ");
                    localDate = LocalDate.parse(timeStamp[0]);
                            //checking if the transaction happened within given time
                    if (localDate.isAfter(startDate)&&localDate.isBefore(endDate)) {
                            //puting users to related age group.
                        addTORelatedAge(transaction.getUnipointCustomerProfile());
                            
                        OutletGraphData outletGraph = new OutletGraphData();
                        outletGraph.setOutlet(transaction.getOutlet());
                        if (outletList.contains(outletGraph)) {
                            //outlet contains outlet.
                            outletList.get(outletList.indexOf(outletGraph)).addTORelatedAge(transaction.getUnipointCustomerProfile());
                            outletList.get(outletList.indexOf(outletGraph)).incrementOutletcount();
                        }else{
                            //outletlist doesnt contains the outlet.
                            outletGraph.incrementOutletcount();
                            outletList.add(outletGraph);
                            outletGraph.addTORelatedAge(transaction.getUnipointCustomerProfile());
                        }                    
                    }
                }	
            }
   
        public void addTORelatedAge(UnipointCustomerProfile customer){
                        Date date = customer.getBirthdate();
                        LocalDate birthdate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                        long years = birthdate.until(LocalDate.now(), ChronoUnit.YEARS);
                        String Gender = customer.getGender();
                        Gender = Gender.replaceAll("\\s","");
                        
                        if (years>=13&&years<17) {
                        int data =  Gender.equals("Male")? graphData.get("le17").incrementMaleCount() : graphData.get("le17").incrementFeMaleCount();
                        }else if (years>=18&&years<24) {
                        int data =  Gender.equals("Male")? graphData.get("le24").incrementMaleCount() : graphData.get("le24").incrementFeMaleCount();    
                        }else if (years>=25&&years<34) {
                        int data =  Gender.equals("Male")? graphData.get("le34").incrementMaleCount() : graphData.get("le34").incrementFeMaleCount();
                        }else if (years>=35&&years<44) {
                        int data =  Gender.equals("Male")? graphData.get("le44").incrementMaleCount() : graphData.get("le44").incrementFeMaleCount();    
                        }else if (years>=45&&years<54) {
                        int data =  Gender.equals("Male")? graphData.get("le54").incrementMaleCount() : graphData.get("le54").incrementFeMaleCount();    
                        }else if (years>=55&&years<64) {
                        int data =  Gender.equals("Male")? graphData.get("le64").incrementMaleCount() : graphData.get("le64").incrementFeMaleCount();
                        }else if(years <= 65){
                        int data =  Gender.equals("Male")? graphData.get("ge65").incrementMaleCount() : graphData.get("ge65").incrementFeMaleCount();
                        }
        }
        @RequestMapping(value = "/Demograpic", method = RequestMethod.GET)
    	public String init(){
    		 return "report_demographic";
    	}
       }
