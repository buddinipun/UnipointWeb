package com.unipoint.dao;

import java.util.List;

import com.unipoint.model.BuzzedMe;
import com.unipoint.model.CustomerRequests;

public interface AcceptRequestDao {

	public void saveAcceptRequest(CustomerRequests customerRequests);
	public List<CustomerRequests> getAllCusRequests();
	public void updateBuzzMe(CustomerRequests customerRequests);
	
	
}
