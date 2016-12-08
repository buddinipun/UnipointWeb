package com.unipoint.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unipoint.dao.BuzzedMeDao;
import com.unipoint.model.BuzzedMe;
import com.unipoint.service.BuzzedMeServices;

@Service
public class BuzzedMeServiceImpl implements BuzzedMeServices{

	@Autowired
	BuzzedMeDao buzzedMeDao;
	
	@Transactional
	public void assBuzzedMe(BuzzedMe buzzedMe) {
		
		buzzedMeDao.saveBuzzedMe(buzzedMe);
	}

	@Transactional
	public List<BuzzedMe> getAllBuzzedMe() {
		
		return buzzedMeDao.getAllBuzzedMe();
	}

	@Transactional
	public void updateBuzzMe(BuzzedMe upBuzzedMe) {
		buzzedMeDao.updateBuzzMe(upBuzzedMe);
		
		
	}

	@Transactional
	public void deleteBuzzedMe(BuzzedMe buzzedMe) {
		buzzedMeDao.deleteBuzzMe(buzzedMe);
		
	}


}
