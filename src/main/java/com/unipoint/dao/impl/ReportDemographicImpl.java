package com.unipoint.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unipoint.dao.ReportDemographicDao;
import com.unipoint.model.Transaction;
import com.unipoint.model.UnipointCustomerProfile;
import java.time.LocalDate;
import java.time.ZoneId;
@Repository
public class ReportDemographicImpl implements ReportDemographicDao {
	@Autowired
	SessionFactory sessionfactory;
	@Override
	public List<Transaction> GetAllTransactions() {
		// TODO Auto-generated method stub
		List<Transaction> transactions = sessionfactory.openSession().createQuery("From Transaction where date_time =: now").list();
		System.out.println(transactions);
		return null;
	}
        
	@Override
	public List<Transaction> getTransactionCount() {
		Criteria lastyearTransaction = sessionfactory.openSession().createCriteria(Transaction.class);
                List<Transaction> demograticdetails =  lastyearTransaction.list();
                return demograticdetails;
	}
	
}


