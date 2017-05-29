package com.unipoint.dao;

import java.util.List;

import com.unipoint.model.Offer;
public interface OfferDao {
	
	public void saveOffer(Offer offer);
	public List <Offer> getAlloffers();

}
