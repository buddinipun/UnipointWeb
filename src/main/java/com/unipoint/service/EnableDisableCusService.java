package com.unipoint.service;

import java.util.List;

import com.unipoint.model.CustomerRequests;
import com.unipoint.model.SubscribeMerchant;

public interface EnableDisableCusService {

	public void assEnableDisableData(SubscribeMerchant subscribeMerchant);
	public List<SubscribeMerchant> getEnableDisableCustomers();
	public void updateEnableDisableCustomers(SubscribeMerchant subscribeMerchant);
}
