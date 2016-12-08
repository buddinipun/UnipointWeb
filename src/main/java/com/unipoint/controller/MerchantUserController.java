package com.unipoint.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.unipoint.model.Merchant;
import com.unipoint.model.Organization;
import com.unipoint.service.MerchantService;
import com.unipoint.service.OrganizationService;

@Controller
public class MerchantUserController {

	@Autowired
	MerchantService merchantService;
	@Autowired
	OrganizationService orgaizationservice;
	
	@RequestMapping(value="/Merchantuser")
	public String init(Map<String, Object> map){
		map.put("merchants", merchantService.getAllMerchant());
		map.put("merchant", new Merchant());
		map.put("organizations", orgaizationservice.getAllOrganization());
		
		return "add_merchant";
		
	}
	
	@RequestMapping(value="/merchantuser.process", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Merchant merchant, BindingResult result, @RequestParam String action, Map<String, Object> map){
		
		switch(action.toLowerCase()){
		case "add":
		
			
			merchantService.addMerchant(merchant);
			break;
		case "edit":
			
			break;
		case "delete":
			
			break;
		case "search":
			
			break;
		}
		
		map.put("merchants",merchantService.getAllMerchant());
		map.put("organizations", orgaizationservice.getAllOrganization());
		return "add_merchant";
	}
	
	
}
