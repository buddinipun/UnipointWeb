package com.unipoint.dao;

import java.util.List;

import com.unipoint.model.Transaction;

public interface ActiveInactiveReportDao {

	public void saveActiveInactive(Transaction transaction);
	public List<Transaction> getAllActiveInactiveData();
	public void updateBuzzMe(Transaction transaction);
}
