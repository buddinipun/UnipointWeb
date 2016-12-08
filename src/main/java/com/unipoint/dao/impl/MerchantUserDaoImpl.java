package com.unipoint.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unipoint.dao.MerchantUserDao;
import com.unipoint.model.Merchant;
@Repository
public class MerchantUserDaoImpl implements MerchantUserDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public List<Merchant> getAllMerchant() {
		// TODO Auto-generated method stub
	List<Merchant> merchant = sessionFactory.getCurrentSession().createQuery("From Merchant").list();
	return merchant;
		
	}
	@Override
	public void saveMerchant(Merchant merchant) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(merchant);
	}
	
	

}
