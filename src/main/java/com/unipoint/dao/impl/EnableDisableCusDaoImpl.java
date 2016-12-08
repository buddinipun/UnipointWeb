package com.unipoint.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unipoint.dao.EnableDisableCustomersDao;
import com.unipoint.model.BuzzedMe;
import com.unipoint.model.CustomerRequests;
import com.unipoint.model.SubscribeMerchant;

@Repository
public class EnableDisableCusDaoImpl implements EnableDisableCustomersDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void saveEnableDisableCusData(SubscribeMerchant subscribeMerchant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SubscribeMerchant> getAllEnableDisableData() {
		
		List<SubscribeMerchant> subscribeMerchants = sessionFactory.openSession()
				.createQuery("From SubscribeMerchant").list();

		// Criteria criteria =
		// sessionFactory.openSession().createCriteria(CustomerRequests.class);
		// List<CustomerRequests> customerRequests = criteria.list();
		// ;
		System.out.println("CusRequest :" + subscribeMerchants);

		return subscribeMerchants;
	}

	@Override
	public void updateEnableDisableData(SubscribeMerchant subscribeMerchant) {
		try{
			
			String status = subscribeMerchant.getEnabled();
			
			if(status != null){
				System.out.println("Inside DaoImpl if :"+subscribeMerchant.getSubscriptionid());
				Session session = sessionFactory.openSession();
				Transaction tx = session.beginTransaction();
				SubscribeMerchant subsMerchant =  (SubscribeMerchant) session.load(SubscribeMerchant.class, subscribeMerchant.getSubscriptionid());
				subsMerchant.setEnabled(status);
			
				session.update(subsMerchant);
				tx.commit();
				session.close();
				
			}else{
				System.out.println("-------------Error---------------");
			}
			
	}catch(Exception ex){
		ex.printStackTrace();
	}
		
	}

}
