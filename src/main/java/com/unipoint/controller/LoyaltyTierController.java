package com.unipoint.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unipoint.model.LoyaltyScheme;
import com.unipoint.service.SchemaSrvices;

@Controller
public class LoyaltyTierController {

	
	@RequestMapping(value="/LoyaltyTier")
	public String init(Map<String, Object> map){
		
		
		return "LoyaltyTierMoments";
		
	}
}
