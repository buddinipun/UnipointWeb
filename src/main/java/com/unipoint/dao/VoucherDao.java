package com.unipoint.dao;

import java.util.List;

import com.unipoint.model.Vouchers;

public interface VoucherDao {
	
	public void addVoucher(Vouchers vouchers);
	public List<Vouchers> getVouchers();

}
