package com.unipoint.dao;

import java.util.List;

import com.unipoint.model.SubscribeMerchant;


public interface EnableDisableCustomersDao {

	public void saveEnableDisableCusData(SubscribeMerchant subscribeMerchant);
	public List<SubscribeMerchant> getAllEnableDisableData();
	public void updateEnableDisableData(SubscribeMerchant subscribeMerchant);
	
}
