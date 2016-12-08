package com.unipoint.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unipoint.dao.MerchantUserDao;
import com.unipoint.model.Merchant;
@Service
public class MerchantUserServiceimpl implements MerchantUserDao {

	@Autowired
	MerchantUserDao merchantuserdao; 
	@Transactional
	public List<Merchant> getAllMerchant() {
		// TODO Auto-generated method stub
		return merchantuserdao.getAllMerchant();
	
		
	}
	@Transactional
	public void saveMerchant(Merchant merchant) {
		// TODO Auto-generated method stub
		
		merchantuserdao.saveMerchant(merchant);
		
	}

}
