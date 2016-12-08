package com.unipoint.service;

import java.util.List;

import com.unipoint.model.CustomerRequests;
import com.unipoint.model.Transaction;

public interface ActiveInactiveService {

	public void assActiveInactive(Transaction transaction);
	public List<Transaction> getActiveInactiveData();
	public void updateAcceptRequest(Transaction transaction);
}
