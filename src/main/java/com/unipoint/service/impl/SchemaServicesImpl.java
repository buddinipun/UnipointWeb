package com.unipoint.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unipoint.dao.SchemaDao;
import com.unipoint.model.LoyaltyScheme;
import com.unipoint.service.SchemaSrvices;
@Service
public class SchemaServicesImpl implements SchemaSrvices {

	@Autowired
	SchemaDao schemadao;
	@Transactional
	public void addSchema(LoyaltyScheme loyaltyScheme) {
		// TODO Auto-generated method stub
		
		schemadao.addSchema(loyaltyScheme);
		
	}
	@Transactional
	public List<LoyaltyScheme> getAllSchemes() {
		// TODO Auto-generated method stub
		
		return schemadao.getSchemas();
	}
	@Override
	public void deleteSchema(LoyaltyScheme loyaltyScheme) {
		// TODO Auto-generated method stub
		schemadao.deleteSchema(loyaltyScheme);
	}

}
