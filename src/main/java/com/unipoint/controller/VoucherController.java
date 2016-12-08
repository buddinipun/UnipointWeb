package com.unipoint.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.unipoint.model.Merchant;
import com.unipoint.model.MerchantUser;
import com.unipoint.model.Vouchers;
import com.unipoint.service.VoucherService;
@Controller
public class VoucherController {
		@Autowired
		VoucherService voucherservice;
	
		@RequestMapping(value="/Voucher")
		public String init(Map<String, Object> map){
			map.put("voucher", new Vouchers());
			map.put("vouchers", voucherservice.getAllVouchers());
			return "add_vouchers";
			
	}	
		
		@RequestMapping(value="/voucher.process", method=RequestMethod.POST)
		public String doActions(@ModelAttribute Vouchers voucher, BindingResult result, @RequestParam String action, Map<String, Object> map){
			switch(action.toLowerCase()){
			case "add":
				MerchantUser merchantUser = new MerchantUser();
				merchantUser.setMerchantUserId(1);
				DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
				Date today = Calendar.getInstance().getTime();        
				String reportDate = df.format(today);
				voucher.setCreatedDateTime(reportDate);
				voucher.setMerchantUserByCreatedByRef(merchantUser);
				voucherservice.addVoucher(voucher);
				break;
			case "edit":
				
				break;
			case "delete":
				
				break;
			case "search":
				
				break;
			}
			
			map.put("voucher", new Vouchers());
			map.put("vouchers", voucherservice.getAllVouchers());
			return "add_vouchers";
		}	

}
