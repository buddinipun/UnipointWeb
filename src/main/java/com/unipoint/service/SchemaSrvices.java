package com.unipoint.service;

import java.util.List;

import com.unipoint.model.BuzzedMe;
import com.unipoint.model.LoyaltyScheme;

public interface SchemaSrvices {
	
	public void addSchema(LoyaltyScheme loyaltyScheme);
	public List<LoyaltyScheme> getAllSchemes();
	public void deleteSchema(LoyaltyScheme loyaltyScheme);
	
}
