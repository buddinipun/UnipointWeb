package com.unipoint.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unipoint.dao.MerchantDao;
import com.unipoint.model.Merchant;

@Repository
public class MerchantDaoImpl implements MerchantDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Merchant> getAllMerchant() {
		System.out.println("data access");
		System.out.println(sessionFactory.getCurrentSession().isConnected());
		List<Merchant> merchant = sessionFactory.getCurrentSession().createQuery("From Merchant").list();
		System.out.println(merchant.size());
		return merchant;
	}

	@Override
	public void addMerchant(Merchant merchant) {
		sessionFactory.getCurrentSession().save(merchant);
	}

}
