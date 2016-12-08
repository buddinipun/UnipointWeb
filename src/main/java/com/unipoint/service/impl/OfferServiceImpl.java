package com.unipoint.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unipoint.dao.OfferDao;
import com.unipoint.model.Offer;
import com.unipoint.service.OfferService;

@Service
public class OfferServiceImpl implements OfferService{

	@Autowired
	OfferDao offerservice;
	@Transactional
	public void saveOffer(Offer offer) {
		// TODO Auto-generated method stub
		
		offerservice.saveOffer(offer);
	}
	
	

}
