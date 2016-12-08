package com.unipoint.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.unipoint.model.CustomerRequests;
import com.unipoint.model.SubscribeMerchant;
import com.unipoint.service.EnableDisableCusService;

@Controller
public class EnableDisableCustomers {

	@Autowired
	EnableDisableCusService enableDisableCusService;
	
	@RequestMapping(value="/EnableDisableCustomers")
	public String init(Map<String, Object> map){
		
		map.put("enabledisablecustomers", enableDisableCusService.getEnableDisableCustomers());
		map.put("enabledisablecustomer", new SubscribeMerchant());
		
		
		return "enable_disable_customers";
	}

	@RequestMapping(value="/enabledisablecustomer.process", method=RequestMethod.POST)
	public String doActions(@ModelAttribute SubscribeMerchant enableDisableCustomer, BindingResult result, @RequestParam String action, Map<String, Object> map){
		
		switch(action.toLowerCase()){
		case "add":
			
//			acceptRequestService.assAcceptCusRequest(customerRequests);
			break;
		case "edit":
			
			break;
		case "delete":
			
			break;
		case "search":
			
			break;
		case "update":
			
			enableDisableCusService.updateEnableDisableCustomers(enableDisableCustomer);
			System.out.println("ID :" + enableDisableCustomer.getSubscriptionid());
			System.out.println("Status :" + enableDisableCustomer.getEnabled());
			break;
			
		}
		
		map.put("enabledisablecustomers", enableDisableCusService.getEnableDisableCustomers());
		map.put("enabledisablecustomer", new SubscribeMerchant());
		
		return "enable_disable_customers";
	}
}
