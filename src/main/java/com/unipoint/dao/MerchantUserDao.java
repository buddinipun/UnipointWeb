package com.unipoint.dao;

import java.util.List;

import com.unipoint.model.Merchant;

public interface MerchantUserDao {
	
	public List<Merchant> getAllMerchant();
	public void saveMerchant(Merchant merchant);
	

}
