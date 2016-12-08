package com.unipoint.dao.impl;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unipoint.dao.OfferDao;
import com.unipoint.model.Offer;
@Repository
public class OfferDaoImpl implements OfferDao {

	@Autowired
	SessionFactory sessionfactory;
	@Override
	public void saveOffer(Offer offer) {
		// TODO Auto-generated method stub
		
		sessionfactory.getCurrentSession().save(offer);
	}

}
