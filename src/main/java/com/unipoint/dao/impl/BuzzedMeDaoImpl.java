package com.unipoint.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unipoint.dao.BuzzedMeDao;
import com.unipoint.model.BuzzedMe;

@Repository
public class BuzzedMeDaoImpl implements BuzzedMeDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveBuzzedMe(BuzzedMe buzzedMe) {
		sessionFactory.openSession().save(buzzedMe);

	}

	@Override
	public List<BuzzedMe> getAllBuzzedMe() {

		List<BuzzedMe> buzzedmes = sessionFactory.openSession()
				.createQuery("From BuzzedMe").list();

		return buzzedmes;
	}

	@Override
	public void updateBuzzMe(BuzzedMe upBuzzedMe) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			BuzzedMe buzzedMe = (BuzzedMe) session.load(BuzzedMe.class,
					upBuzzedMe.getBuzzedmeid());
			// BuzzedMe buzzedMe = (BuzzedMe) session.load(BuzzedMe.class, 1);
			buzzedMe.setContacted(upBuzzedMe.getContacted());
			buzzedMe.setDescription(upBuzzedMe.getDescription());
			session.update(buzzedMe);
			tx.commit();
			session.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void deleteBuzzMe(BuzzedMe upBuzzedMe) {

		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			// Long buzzedMeId = upBuzzedMe.getBuzzedmeid();
			BuzzedMe buzzedMe = (BuzzedMe) session.load(BuzzedMe.class,upBuzzedMe.getBuzzedmeid());
			session.delete(buzzedMe);
//			System.out.println("Rows affected: " + result);
			tx.commit();
			session.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
