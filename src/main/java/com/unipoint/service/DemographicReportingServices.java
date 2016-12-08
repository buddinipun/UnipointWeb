package com.unipoint.service;

import java.util.List;

import com.unipoint.model.Transaction;

public interface DemographicReportingServices {
	
	public List<Transaction> getAllTransations();
	public int getTransactionCount();

}
