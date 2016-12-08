package com.unipoint.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unipoint.dao.EnableDisableCustomersDao;
import com.unipoint.model.SubscribeMerchant;
import com.unipoint.service.EnableDisableCusService;

@Service
public class EnableDisableCusServiceImpl implements EnableDisableCusService{

	@Autowired
	EnableDisableCustomersDao enableDisableCustomerDao;
	
	@Transactional
	public void assEnableDisableData(SubscribeMerchant subscribeMerchant) {
		enableDisableCustomerDao.saveEnableDisableCusData(subscribeMerchant);	
		
		
	}

	@Transactional
	public List<SubscribeMerchant> getEnableDisableCustomers() {
		
		return enableDisableCustomerDao.getAllEnableDisableData();
	}

	@Transactional
	public void updateEnableDisableCustomers(SubscribeMerchant subscribeMerchant) {
		enableDisableCustomerDao.updateEnableDisableData(subscribeMerchant);
		
	}

}
