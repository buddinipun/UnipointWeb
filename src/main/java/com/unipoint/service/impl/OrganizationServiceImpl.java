package com.unipoint.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unipoint.dao.OrganizationDao;
import com.unipoint.model.Organization;
import com.unipoint.service.OrganizationService;
@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	OrganizationDao organizationDao;
	@Transactional
	public void addOrganization(Organization organization) {
		// TODO Auto-generated method stub

		organizationDao.addOrganization(organization);
		
		
		
	}
	@Transactional
	public void deleteOrganization(long organization) {
		// TODO Auto-generated method stub
		organizationDao.deleteOrganization(organization);
	}
	@Transactional
	public List<Organization> getAllOrganization() {
		// TODO Auto-generated method stub
		return organizationDao.getAllorganization();
	}

	
}
