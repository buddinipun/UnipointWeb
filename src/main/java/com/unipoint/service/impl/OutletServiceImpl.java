package com.unipoint.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unipoint.dao.MerchantDao;
import com.unipoint.dao.OutletDao;
import com.unipoint.model.Merchant;
import com.unipoint.model.MerchantUser;
import com.unipoint.model.Organization;
import com.unipoint.model.Outlet;
import com.unipoint.service.MerchantService;
import com.unipoint.service.OutletService;

@Service
public class OutletServiceImpl implements OutletService {

	@Autowired
	OutletDao outletDao;

	@Transactional
	public void assOutlet(Outlet outlet) {
		// TODO Auto-generated method stub
		outletDao.saveOutlet(outlet);
	}

	@Transactional
	public List<Outlet> getAllOutlet() {
		// TODO Auto-generated method stub
		return outletDao.getAllOutlet();
	}

	@Transactional
	public void addManager(MerchantUser merchantUser) {
		// TODO Auto-generated method stub
		outletDao.saveManager(merchantUser);
	}
	
	

	

	

}