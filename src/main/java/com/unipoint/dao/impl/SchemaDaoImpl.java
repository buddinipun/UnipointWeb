package com.unipoint.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unipoint.dao.SchemaDao;
import com.unipoint.model.BuzzedMe;
import com.unipoint.model.LoyaltyScheme;
@Repository
public class SchemaDaoImpl implements SchemaDao {

	@Autowired
	SessionFactory sessionfactory;

	@Override
	public void addSchema(LoyaltyScheme loyaltyScheme) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(loyaltyScheme);
	}

	@Override
	public List<LoyaltyScheme> getSchemas() {
		// TODO Auto-generated method stub
		List <LoyaltyScheme> loyaltySchemes = sessionfactory.getCurrentSession().createQuery("From LoyaltyScheme").list();
		return loyaltySchemes;
	}

	@Override
	public void deleteSchema(LoyaltyScheme loyaltyScheme) {
		try {
			Session session = sessionfactory.openSession();
			Transaction tx = session.beginTransaction();
			// Long buzzedMeId = upBuzzedMe.getBuzzedmeid();
			LoyaltyScheme delLoyaltyScheme = (LoyaltyScheme) session.load(LoyaltyScheme.class,loyaltyScheme.getSchemeId());
			session.delete(delLoyaltyScheme);
//			System.out.println("Rows affected: " + result);
			tx.commit();
			session.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	

}
