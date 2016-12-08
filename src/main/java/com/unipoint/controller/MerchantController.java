package com.unipoint.controller;

import java.util.HashMap;
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

@Controller
public class MerchantController {

	@Autowired
	MerchantService merchantService;
	
	@RequestMapping(value="/Merchant")
	public String init(Map<String, Object> map){
		map.put("merchants", merchantService.getAllMerchant());
		map.put("merchant", new Merchant());
		System.out.println(merchantService.getAllMerchant().size());
		return "merchant";
	}
	
	@RequestMapping(value="/merchant.process", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Merchant merchant, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Organization organization = new Organization();
		organization.setOrgainizationId(1);
		switch(action.toLowerCase()){
		case "add":
			merchant.setOrganization(organization);
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
		return "merchant";
	}
}
