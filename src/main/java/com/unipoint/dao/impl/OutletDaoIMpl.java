package com.unipoint.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unipoint.dao.OutletDao;
import com.unipoint.model.MerchantUser;
import com.unipoint.model.Outlet;
@Repository
public class OutletDaoIMpl implements OutletDao {
	@Autowired
	SessionFactory sessionfactory;
	@Override
	public void saveOutlet(Outlet outlet) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(outlet);
		
		
	}

	@Override
	public List<Outlet> getAllOutlet() {
		// TODO Auto-generated method stub
		List<Outlet> outlets = sessionfactory.getCurrentSession().createQuery("From Outlet").list();
		return outlets;
	}

	@Override
	public void saveManager(MerchantUser merchantUser) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(merchantUser);
	}
	
	

}
