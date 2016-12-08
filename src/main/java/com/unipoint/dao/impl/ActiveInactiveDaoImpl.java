package com.unipoint.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unipoint.dao.ActiveInactiveReportDao;
import com.unipoint.model.CustomerRequests;
import com.unipoint.model.Transaction;

@Repository
public class ActiveInactiveDaoImpl implements ActiveInactiveReportDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveActiveInactive(Transaction transaction) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Transaction> getAllActiveInactiveData() {

		List<Transaction> transaction = sessionFactory.openSession()
				.createQuery("From Transaction").list();

		// Criteria criteria =
		// sessionFactory.openSession().createCriteria(CustomerRequests.class);
		// List<CustomerRequests> customerRequests = criteria.list();
		// ;
		System.out.println("Transaction :" + transaction);

		return transaction;
	}

	@Override
	public void updateBuzzMe(Transaction transaction) {
		// TODO Auto-generated method stub

	}

}
