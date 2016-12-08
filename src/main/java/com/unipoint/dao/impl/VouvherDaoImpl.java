package com.unipoint.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unipoint.dao.VoucherDao;
import com.unipoint.model.Vouchers;
@Repository
public class VouvherDaoImpl implements VoucherDao{

		@Autowired
		SessionFactory sessionfactory;
	@Override
	public void addVoucher(Vouchers vouchers) {
		// TODO Auto-generated method stub
		
		sessionfactory.getCurrentSession().save(vouchers);
		
		
	}
	@Override
	public List<Vouchers> getVouchers() {
		// TODO Auto-generated method stub
		List<Vouchers> vouchers = sessionfactory.getCurrentSession().createQuery("From Vouchers").list();
		return vouchers;
	}
	
	

}
