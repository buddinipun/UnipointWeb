package com.unipoint.service;

import java.util.List;

import com.unipoint.model.CustomerRequests;

public interface AcceptRequestService {

	public void assAcceptCusRequest(CustomerRequests customerRequests);
	public List<CustomerRequests> getAcceptCusRequest();
	public void updateAcceptRequest(CustomerRequests customerRequests);
	
}
