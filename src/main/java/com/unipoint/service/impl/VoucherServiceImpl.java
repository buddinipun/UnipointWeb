package com.unipoint.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unipoint.dao.VoucherDao;
import com.unipoint.model.Vouchers;
import com.unipoint.service.VoucherService;
@Service
public class VoucherServiceImpl implements VoucherService {
	
	@Autowired
	VoucherDao voucherDao;
	
	@Transactional
	public void addVoucher(Vouchers vouchers) {
		voucherDao.addVoucher(vouchers);
		
		
	}

	@Transactional
	public List<Vouchers> getAllVouchers() {
		// TODO Auto-generated method stub
		
		return voucherDao.getVouchers();
	}

	
}
