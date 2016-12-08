package com.unipoint.dao;

import java.util.List;

import com.unipoint.model.Merchant;
import com.unipoint.model.Organization;

public interface MerchantDao {

	public List<Merchant> getAllMerchant();
	public void addMerchant(Merchant merchant);
	
}
