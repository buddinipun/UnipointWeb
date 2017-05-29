package com.unipoint.controller;

import java.util.List;
import java.util.Map;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.unipoint.model.BuzzedMe;
import com.unipoint.service.BuzzedMeServices;

@Controller
public class BuzzmeController {
	
	@Autowired
	BuzzedMeServices buzzedMeServices;
	
	
	@RequestMapping(value="/BuzzedMe")
	public String init(Map<String, Object> map){
		
		map.put("buzzedmes", buzzedMeServices.getAllBuzzedMe());
		map.put("buzzedme", new BuzzedMe());
		
		return "buzzMe_users";
	}

	@RequestMapping(value="/buzzedme.process", method=RequestMethod.POST)
	public String doActions(@ModelAttribute BuzzedMe buzzedMe, BindingResult result, @RequestParam String action, Map<String, Object> map){
		
		switch(action.toLowerCase()){
		case "add":
			
			buzzedMeServices.assBuzzedMe(buzzedMe);
			break;
		case "edit":
			
			break;
		case "delete":
			
			buzzedMeServices.deleteBuzzedMe(buzzedMe);
//			System.out.println("-----------------Came into the delete case--------------");
			System.out.println("BuzzedMe id = "+buzzedMe.getBuzzedmeid());
			break;
		case "search":
			
			break;
		case "update":
			System.out.println("BuzzedMe :"+buzzedMe.getBuzzedmeid());
			System.out.println("BuzzedMe>> :"+buzzedMe.getDescription());
//			int retResult = 
					buzzedMeServices.updateBuzzMe(buzzedMe);
//			System.out.println("Result "+retResult);
			break;
		}
		
		map.put("buzzedmes", buzzedMeServices.getAllBuzzedMe());
		map.put("buzzedme", new BuzzedMe());
		
		return "buzzMe_users";
	}
}
