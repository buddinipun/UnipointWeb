package com.unipoint.service;

import java.util.List;

import com.unipoint.model.Organization;

public interface OrganizationService {

	public void addOrganization(Organization organization);
	public void deleteOrganization(long organizationid);
	public List<Organization> getAllOrganization();
}
