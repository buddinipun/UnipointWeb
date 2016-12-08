package com.unipoint.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.unipoint.model.BuzzedMe;
import com.unipoint.model.CustomerRequests;
import com.unipoint.service.AcceptRequestService;

@Controller
public class AcceptRequestController {

	@Autowired
	AcceptRequestService acceptRequestService;
	
	@RequestMapping(value="/AcceptRequests")
	public String init(Map<String, Object> map){
		
		map.put("acceptrequests", acceptRequestService.getAcceptCusRequest());
		map.put("acceptrequest", new CustomerRequests());
		
		
		return "accept_requests";
	}

	@RequestMapping(value="/acceptrequest.process", method=RequestMethod.POST)
	public String doActions(@ModelAttribute CustomerRequests acceptrequest, BindingResult result, @RequestParam String action, Map<String, Object> map){
		
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

			System.out.println("acceptrequest :"+acceptrequest);
			System.out.println("acceptrequest>> :"+acceptrequest.getIsAccepted());
//			int retResult = 
			acceptRequestService.updateAcceptRequest(acceptrequest);
			
			System.out.println("testinggggg" + acceptrequest.getUnipointCustomerProfile().getUnipointcustomerid());
			break;
		}
		
		map.put("acceptrequests", acceptRequestService.getAcceptCusRequest());
		map.put("acceptrequest", new CustomerRequests());
		
		return "accept_requests";
	}
}
