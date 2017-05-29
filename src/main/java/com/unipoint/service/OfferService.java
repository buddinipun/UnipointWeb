package com.unipoint.service;

import java.util.List;

import com.unipoint.model.Offer;

public interface OfferService {

	public void saveOffer(Offer offer);
	public List <Offer> getAlloffers();
}
