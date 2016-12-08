package com.unipoint.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unipoint.dao.AcceptRequestDao;
import com.unipoint.model.CustomerRequests;
import com.unipoint.service.AcceptRequestService;

@Service
public class AcceptRequestServiceImpl implements AcceptRequestService{

	@Autowired
	AcceptRequestDao acceptRequestDao;
	
	
	@Transactional
	public void assAcceptCusRequest(CustomerRequests customerRequests) {
	
		acceptRequestDao.saveAcceptRequest(customerRequests);
		
	}

	
	@Transactional
	public void updateAcceptRequest(CustomerRequests customerRequests) {
		
		acceptRequestDao.updateBuzzMe(customerRequests);
		
	}

	@Transactional
	public List<CustomerRequests> getAcceptCusRequest() {

		return acceptRequestDao.getAllCusRequests();
	}

	
}
