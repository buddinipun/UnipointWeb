package com.unipoint.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unipoint.dao.OfferDao;
import com.unipoint.model.Offer;
import com.unipoint.model.Organization;
import com.unipoint.service.OfferService;

@Service
public class OfferServiceImpl implements OfferService{

	@Autowired
	OfferDao offerdao;
	@Transactional
	public void saveOffer(Offer offer) {
		// TODO Auto-generated method stub
		
		offerdao.saveOffer(offer);
		
	}
	@Override
	public List<Offer> getAlloffers() {
		// TODO Auto-generated method stub
		
		return offerdao.getAlloffers();
	}
	
	

}
