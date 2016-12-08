package com.unipoint.service;

import java.util.List;

import com.unipoint.model.MerchantUser;
import com.unipoint.model.Outlet;

public interface OutletService {
	
	public void assOutlet(Outlet outlet);
	public List<Outlet> getAllOutlet();
	public void addManager(MerchantUser merchantUser);

}
