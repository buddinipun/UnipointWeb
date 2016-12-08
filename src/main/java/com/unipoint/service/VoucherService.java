package com.unipoint.service;

import java.util.List;

import com.unipoint.model.Vouchers;

public interface VoucherService {
	
	public void addVoucher(Vouchers vouchers);
	public List<Vouchers> getAllVouchers();

}
