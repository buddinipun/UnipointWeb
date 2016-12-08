package com.unipoint.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unipoint.dao.OrganizationDao;
import com.unipoint.model.Organization;
@Repository
public class OrganizationDaoImpl implements OrganizationDao {
	
	@Autowired
	SessionFactory sessionfactory;
	@Override
	public void addOrganization(Organization organization) {
		// TODO Auto-generated method stub
		
		sessionfactory.openSession().save(organization);
		
	}
	@Override
	public void deleteOrganization(long organization) {
		// TODO Auto-generated method stub
		
		sessionfactory.getCurrentSession().delete(organization);
		
	}
	
	@Override
	public List<Organization> getAllorganization() {
		// TODO Auto-generated method stub
		List<Organization> organizations= sessionfactory.openSession().createQuery("From Organization").list();
		return organizations;
	}

	
}
