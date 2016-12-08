package com.unipoint.controller;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import javax.persistence.AttributeOverride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.unipoint.model.Merchant;
import com.unipoint.model.MerchantUser;
import com.unipoint.model.Organization;
import com.unipoint.service.OrganizationService;
@Controller
public class OrgnizationController {
	@Autowired
	OrganizationService orgaizationservice;
	
	@RequestMapping(value="/Organization")
	public String init(Map<String, Object> map){
		map.put("organizations", orgaizationservice.getAllOrganization());
		map.put("organization", new Organization());
//		System.out.println(orgaizationservice.getAllOrganization().size());
		return "add_organization";
	}

	@RequestMapping(value="/organization.process", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Organization organization, BindingResult result, @RequestParam String action, Map<String, Object> map){
		
		switch(action.toLowerCase()){
		case "add":
			MerchantUser merchantUser = new MerchantUser();
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			Date today = Calendar.getInstance().getTime();        
			String reportDate = df.format(today);
			merchantUser.setMerchantUserId(1);
			organization.setAddedDateTime(reportDate);
			organization.setMerchantUserByAddedByRef(merchantUser);
			orgaizationservice.addOrganization(organization);
			break;
		case "edit":
			
			break;
		case "delete":
			orgaizationservice.deleteOrganization(organization.getOrgainizationId());
			break;
		case "search":
			
			break;
		}
		map.put("organizations", orgaizationservice.getAllOrganization());
		map.put("organization", organization);
		return "add_organization";
	}
	
}
