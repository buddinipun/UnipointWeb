package com.unipoint.dao;

import java.util.List;

import com.unipoint.model.BuzzedMe;
import com.unipoint.model.LoyaltyScheme;

public interface SchemaDao {
	
	public void addSchema(LoyaltyScheme loyaltyScheme);
	public List<LoyaltyScheme> getSchemas();
	public void deleteSchema(LoyaltyScheme loyaltyScheme);

}
