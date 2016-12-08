package com.unipoint.service;

import java.util.List;

import com.unipoint.model.Merchant;

public interface MerchantUserService {
	
	public List <Merchant> getAllMerchant();
	public void saveMerchant(Merchant merchant);
}
