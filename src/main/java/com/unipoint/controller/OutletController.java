package com.unipoint.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.unipoint.model.MerchantUser;
import com.unipoint.model.Outlet;
import com.unipoint.service.OutletService;

@Controller
public class OutletController {
	@Autowired
	OutletService outletservice;
	
	@RequestMapping(value="/Outlet")
	public String init(Map<String, Object> map){
		map.put("outlets", outletservice.getAllOutlet());
		map.put("outlet", new Outlet());
		map.put("merchantUser", new MerchantUser());
		
		return "DefineOutlets";
	}
	
	@RequestMapping(value="/outlet.process", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Outlet outlet, BindingResult result, @RequestParam String action, Map<String, Object> map){
		
		switch(action.toLowerCase()){
		case "add":
			
			outletservice.assOutlet(outlet);;
			break;
		case "edit":
			
			break;
		case "delete":
			
			break;
		case "search":
			
			break;
		}
		
		map.put("outlets", outletservice.getAllOutlet());
		map.put("outlet", new Outlet());
		map.put("merchantUser", new MerchantUser());
		return "DefineOutlets";
	}
	
	@RequestMapping(value="/manager.define", method=RequestMethod.POST)
	public String creteManager(@ModelAttribute MerchantUser merchantUser, BindingResult result, @RequestParam String action, Map<String, Object> map){
		
		switch(action.toLowerCase()){
		case "add":
			outletservice.addManager(merchantUser);
//			outletservice.assOutlet(outlet);;
			break;
		case "edit":
			
			break;
		case "delete":
			
			break;
		case "search":
			
			break;
		}
		
		map.put("outlets", outletservice.getAllOutlet());
		map.put("outlet", new Outlet());
		
		return "DefineOutlets";
	}
	

}
