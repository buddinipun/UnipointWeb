package com.unipoint.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unipoint.dao.MerchantDao;
import com.unipoint.model.Merchant;
import com.unipoint.model.Organization;
import com.unipoint.service.MerchantService;

@Service
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	MerchantDao merchantDao;
	 
	@Transactional
	public List<Merchant> getAllMerchant() {
		return merchantDao.getAllMerchant();
	}

	@Transactional
	public void addMerchant(Merchant merchant) {
		merchantDao.addMerchant(merchant);
	}
	
	

	

	

}
