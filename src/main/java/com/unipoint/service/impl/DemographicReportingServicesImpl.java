package com.unipoint.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unipoint.dao.ReportDemographicDao;
import com.unipoint.model.Transaction;
import com.unipoint.service.DemographicReportingServices;
@Service
public class DemographicReportingServicesImpl implements DemographicReportingServices {
	@Autowired
	ReportDemographicDao ReportingDemographicDao;
	@Transactional
	public List<Transaction> getAllTransations() {
		// TODO Auto-generated method stub
		
		return ReportingDemographicDao.GetAllTransactions();
		
	}
	@Transactional
	public int getTransactionCount() {
		// TODO Auto-generated method stub
		ReportingDemographicDao.GetAllTransactions();
		return 0;
	}

}
