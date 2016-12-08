package com.unipoint.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unipoint.dao.ActiveInactiveReportDao;
import com.unipoint.model.Transaction;
import com.unipoint.service.ActiveInactiveService;

@Service
public class ActiveInactiveServiceImpl implements ActiveInactiveService {

	@Autowired
	ActiveInactiveReportDao actiiveInactiveDao;
	
	@Transactional
	public void assActiveInactive(Transaction transaction) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public List<Transaction> getActiveInactiveData() {

		
		return actiiveInactiveDao.getAllActiveInactiveData();
	}

	@Transactional
	public void updateAcceptRequest(Transaction transaction) {
		// TODO Auto-generated method stub
		
	}

}
