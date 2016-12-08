package com.unipoint.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestScope;

import com.unipoint.model.Transaction;
import com.unipoint.service.ActiveInactiveService;

@Controller
public class ActiveInactiveReport {

	@Autowired
	ActiveInactiveService activeInactiveService;
	
	@RequestMapping(value="/ActiveInactive")
	public String init(Map<String, Object> map){
		
		map.put("activeInactiveReports", activeInactiveService.getActiveInactiveData());
		
		map.put("activeInactive", new Transaction());
		
		
		return "activeInactiveReport";
		
	}

	@RequestMapping(value="/activeInactive.process", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Transaction transaction, BindingResult result, @RequestParam String action, Map<String, Object> map){
		
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

		}
		
		map.put("activeInactiveReports", activeInactiveService.getActiveInactiveData());
		map.put("activeInactive", new Transaction());
		
		return "activeInactiveReport";
	}
}
