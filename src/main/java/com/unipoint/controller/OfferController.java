package com.unipoint.controller;

import java.io.File;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.unipoint.model.LoyaltyScheme;
import com.unipoint.model.Offer;
import com.unipoint.service.OfferService;


@Controller
public class OfferController {
	
	
	@Autowired
	OfferService offerservice;
	
	@RequestMapping(value="/Offer")
	public String init(Map<String, Object> map){
//		map.put("merchants", merchantService.getAllMerchant());
		map.put("Offer", new Offer());
//		System.out.println(merchantService.getAllMerchant().size());
		return "create-offer";
	}
	
	@RequestMapping(value="/offer.create", method=RequestMethod.POST)
	public String doActions(
			@ModelAttribute Offer offer,
			BindingResult result,
			@RequestParam String action, Map<String, Object> map,
			HttpServletRequest request){
			
		  	
		    
		switch(action.toLowerCase()){
		case "add":
			offerservice.saveOffer(offer);
//		      schemaservices.addSchema(LoyaltyScheme);
		   
			break;
		case "edit":
			
			break;
		case "delete":
			
			break;
		case "search":
			
			break;
		}
		
//		map.put("LoyaltySchemas",schemaservices.getAllSchemes());
		map.put("Offer", new Offer());
		return "create-offer";
	}
	

}
