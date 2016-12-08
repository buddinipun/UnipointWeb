package com.unipoint.dao.impl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections.list.SetUniqueList;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unipoint.dao.AcceptRequestDao;
import com.unipoint.model.BuzzedMe;
import com.unipoint.model.CustomerRequests;
import com.unipoint.model.LoyaltyScheme;
import com.unipoint.model.Merchant;
import com.unipoint.model.MerchantUser;
import com.unipoint.model.SubscribeMerchant;
import com.unipoint.model.UnipointCustomerProfile;

@Repository
public class AcceptRequestDaoImpl implements AcceptRequestDao {

	Random rd;

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveAcceptRequest(CustomerRequests customerRequests) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<CustomerRequests> getAllCusRequests() {
		List<CustomerRequests> acceptrequests = sessionFactory.openSession()
				.createQuery("From CustomerRequests Where isAccepted=false")
				.list();

		// Criteria criteria =
		// sessionFactory.openSession().createCriteria(CustomerRequests.class);
		// List<CustomerRequests> customerRequests = criteria.list();
		// ;
		System.out.println("CusRequest :" + acceptrequests);

		return acceptrequests;

	}

	@Override
	public void updateBuzzMe(CustomerRequests customerRequests) {
		try {
			System.out.println("uniCusId :"+customerRequests.getUnipointCustomerProfile());
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			CustomerRequests customerRequestsUp = (CustomerRequests) session.load(CustomerRequests.class,
			customerRequests.getRequestid());
			customerRequestsUp.setIsAccepted(customerRequests.getIsAccepted());
		
//			UnipointCustomerProfile uniCusId = customerRequests.getUnipointCustomerProfile();// meka unicus id
//			System.out.println("uniCusId :"+uniCusId);
			
//			int uniCusIdInt = (int)(customerRequests.getUnipointCustomerProfile().getUnipointcustomerid());
//			String uniCusIdStr =  Integer.toString(uniCusIdInt);
			
			
			
			long uniReqId = customerRequests.getRequestid();
//			System.out.println("uniCusId :"+uniCusIdInt);
			java.util.Date date = new java.util.Date();
			System.out.println(new Timestamp(date.getTime()));
			customerRequestsUp.setAddedDateTime(new Timestamp(date.getTime()).toString());
			session.update(customerRequestsUp);
//			tx.commit();
			
			
//			session.close();

			// SubscribeMerchant subscribeMerchant = new SubscribeMerchant();
			// subscribeMerchant.setAddedDateTime(new
			// Timestamp(date.getTime()).toString());
			// int num = rd.nextInt(1000);
			
//			sessionFactory.openSession();
			
			
//			tx = session.beginTransaction();
			List<SubscribeMerchant> lstCrdNum = sessionFactory.getCurrentSession().createQuery("From SubscribeMerchant order by subscriptionid desc 1").list();
			String lastCardNoRslt = lstCrdNum.get(0).getCardnumber();
			System.out.println("result :"+lastCardNoRslt);
			
			
// Generating the card number
	        //SUN2015_000001
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(date);
	        int year = cal.get(Calendar.YEAR);
	        String cardNo = "";
	        String SOID = "";


	        String merchantId = "1"; //  in here we should take the merchant id from the session **hard coded**
	        int merchantIdInt = Integer.parseInt(merchantId);
	        
//	        String uniCusIdStr = uniCusId.toString();
	        
//	        "SUN2015_000001";

	        if (lastCardNoRslt != null) {
	            String lstCrdNoArray[] = lastCardNoRslt.split("-");
	            String lstUniqueNo = lstCrdNoArray[3].trim();
	            String uniCusIdStr = lstCrdNoArray[2].trim();
	            int uc = Integer.parseInt(uniCusIdStr);
	            int lu = Integer.parseInt(lstUniqueNo);
	            
	            ++uc;
	            ++lu;

	            if(merchantIdInt < 10){
	            	merchantId = "-000" + merchantIdInt;
	            	
	            }else if(merchantIdInt < 100){
	            	merchantId = "-00" + merchantIdInt;
	            	
	            }else if(merchantIdInt < 1000){
	            	merchantId = "-0" + merchantIdInt;
	            	
	            }else if(merchantIdInt < 10000){
	            	merchantId = "-" + merchantIdInt;
	            	
	            }else{
	            	
	            	
	            	System.out.println("-------Error occured in merchant id-------");
	            }
	            	   
	            if(uc < 10){
	            	uniCusIdStr = "-000" + uc;
	            	
	            }else if(uc < 100){
	            	uniCusIdStr = "-00" + uc;
	            	
	            }else if(uc < 1000){
	            	uniCusIdStr = "-0" + uc;
	            	
	            }else if(uc < 10000){
	            	uniCusIdStr = "-" + uc;
	            	
	            }else{
	            	
	            	
	            	System.out.println("-------Error occured in merchant id-------");
	            }
	            
	            
	            if (lu < 10) {
	                cardNo = year + merchantId + uniCusIdStr + "-000" + (lu);
//	                SOID = "SOID_" + customer + "00000" + lu + "_1";
	            } else if (lu < 100) {
	                cardNo = year + merchantId + uniCusIdStr + "-00" + (lu);
//	                SOID = "SOID_" + customer + "0000" + lu + "_1";
	            } else if (lu < 1000) {
	                cardNo = year + merchantId + uniCusIdStr + "-0" + (lu);
//	                SOID = "SOID_" + customer + "000" + lu + "_1";
	            } else if (lu < 10000) {
	                cardNo = year +  merchantId +  uniCusIdStr + "-" + (lu);
//	                SOID = "SOID_" + customer + "00" + lu + "_1";
	            }else {
	            
	            	cardNo = year +  merchantId +  uniCusIdStr + "-" + (lu);
//	             	SOID = "SOID_" + customer + "000001_1";
	        }
	        System.out.println("cardNo :" + cardNo);
//	        System.out.println("SOID :" + SOID);
			
			
			
			
			
			
//			int lstCrdNumInt = Integer.parseInt(lastCardNoRslt);
//			int newCrdNum = lstCrdNumInt+1;
//			System.out.println("newCrdNum :"+newCrdNum);
			
			
//			String x = newCrdNum.toString();
			
			
			SubscribeMerchant subscribeMerchant = new SubscribeMerchant();
			subscribeMerchant.setCardnumber(cardNo);
//			subscribeMerchant.setCardnumber("0005");
			UnipointCustomerProfile unipointCustomerProfile2 = new UnipointCustomerProfile();
			unipointCustomerProfile2.setUnipointcustomerid(1);
			subscribeMerchant.setUnipointCustomerProfile(unipointCustomerProfile2);
//			subscribeMerchant.setUnipointCustomerProfile(uniCusId);
			subscribeMerchant.setAddedDateTime(new Timestamp(date.getTime()).toString());
			subscribeMerchant.setCurrentoffercount(0);
			subscribeMerchant.setDatetime(new Timestamp(date.getTime()).toString());
			subscribeMerchant.setEnabled("true"); 
			subscribeMerchant.setExpirydate("undefined"); 
			subscribeMerchant.setIsFollowing(false);
			subscribeMerchant.setIsSubscribed(true);
			subscribeMerchant.setLastModifiedDateTime(new Timestamp(date.getTime()).toString());
			subscribeMerchant.setLastModifiedFields("undefined");
			subscribeMerchant.setMerchantUserByAddedByRef(new MerchantUser(1)); // should be captured from merchant user
			subscribeMerchant.setLatlongregistered("undefined");
			subscribeMerchant.setMerchant(new Merchant(6)); //should be captured from merchant
		
			subscribeMerchant.setMerchantUserByLastModifiedByRef(new MerchantUser(1)); // should be captured from merchant user
			subscribeMerchant.setRedeemablepoints(0.0);
			subscribeMerchant.setRegistereddevice("undefined");
			subscribeMerchant.setQrcode("00000");
			subscribeMerchant.setSchemerefid(7);
			subscribeMerchant.setTotalpoints(new BigDecimal(0));
			sessionFactory.getCurrentSession().save(subscribeMerchant);
			
//			subscribeMerchant.setUnipointCustomerProfile();
			
//			sessionfactory.getCurrentSession().save(loyaltyScheme);
			
			
//			System.out.println("lstCrdNum :" + lstCrdNum.get(0).getCardnumber());
			
			// subscribeMerchant.setCardnumber();
			tx.commit();
			session.close();
	        }
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
