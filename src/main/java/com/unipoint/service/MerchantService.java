package com.unipoint.service;

import java.util.List;

import com.unipoint.model.Merchant;
import com.unipoint.model.Organization;

public interface MerchantService {

	public List<Merchant> getAllMerchant(); 
	public void addMerchant(Merchant merchant);
	
}
