package com.unipoint.dao;

import java.util.List;

import com.unipoint.model.MerchantUser;
import com.unipoint.model.Outlet;

public interface OutletDao {
	
	public void saveOutlet(Outlet outlet);
	public List<Outlet> getAllOutlet();
	public void saveManager(MerchantUser merchantUser);

}
