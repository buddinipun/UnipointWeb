package com.unipoint.dao;

import java.util.Date;
import java.util.List;

import com.unipoint.model.Transaction;
import com.unipoint.model.UnipointCustomerProfile;

public interface ReportDemographicDao {
	
	public List<Transaction> GetAllTransactions();
	//public List<UnipointCustomerProfile> getTransactionCount(Date start,Date end);
	public List<Transaction> getTransactionCount();
}
