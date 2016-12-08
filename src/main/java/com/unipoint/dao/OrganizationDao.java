package com.unipoint.dao;

import java.util.List;

import com.unipoint.model.Organization;

public interface OrganizationDao {
	
	public void addOrganization(Organization organization);
	public void deleteOrganization(long organizationid);
	public List <Organization> getAllorganization();

}
