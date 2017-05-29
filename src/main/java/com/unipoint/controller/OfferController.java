package com.unipoint.controller;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.unipoint.model.LoyaltyScheme;
import com.unipoint.model.Offer;
import com.unipoint.service.OfferService;
import com.unipoint.service.OrganizationService;


@Controller
public class OfferController {
	
	
	@Autowired
	OfferService offerservice;
	
	@RequestMapping(value="/Offer")
	public String init(Map<String, Object> map){
		map.put("offers", offerservice.getAlloffers());
		map.put("Offer", new Offer());
		
//		System.out.println(merchantService.getAllMerchant().size());
		return "create-offer";
	}
	
	@RequestMapping(value="/offer.create", method=RequestMethod.POST)
	public String doActions(
			@ModelAttribute Offer offer,
			BindingResult result,
			@RequestParam String action, Map<String, Object> map,
			HttpServletRequest request){
			
		  	
		    
		switch(action.toLowerCase()){
		case "add":
//			imgeUploader controller = new imgeUploader();
//			ArrayList<String> arr = controller.list;
//			System.out.println("arr list is" + arr);
			HttpSession session = request.getSession();
			ArrayList<String> ImageList = (ArrayList<String>)session.getAttribute("Ingredientes");
			System.out.println("List of images ..............." + ImageList);
			String image_one ="";
			String image_two ="";
			String image_three ="";
			String image_four ="";
			String image_five ="";
			
			
		    	image_one = ImageList.get(0);
		    	image_two = ImageList.get(1);
		    	image_three = ImageList.get(2);
		    	image_four = ImageList.get(3);
		    	image_five = ImageList.get(4);
		    	offer.setImageUrl1(image_one);	
		    	offer.setImageUrl2(image_two);
		    	offer.setImageUrl3(image_three);
		    	offer.setImageUrl4(image_four);
		    	offer.setImageUrl5(image_five);
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			offer.setIssueDateTime(dateFormat.format(date));
			offerservice.saveOffer(offer);
//		    schemaservices.addSchema(LoyaltyScheme);
		   
			break;
		case "edit":
			
			break;
		case "delete":
			
			break;
		case "search":
			
			break;
		}
		
//		map.put("LoyaltySchemas",schemaservices.getAllSchemes());
		map.put("Offer", new Offer());
		map.put("offers", offerservice.getAlloffers());
		return "create-offer";
	}
	
	
	@RequestMapping(value="/offer.bind", method=RequestMethod.POST)
	public String bindOffers(
			@ModelAttribute Offer offer,
			BindingResult result,
			@RequestParam String action, Map<String, Object> map,
			HttpServletRequest request){
		
			
	map.put("Offer", new Offer());
		
//		System.out.println(merchantService.getAllMerchant().size());
		return "create-offer";
		
		
	}
	
	@RequestMapping(value="/season", method=RequestMethod.POST)
	public String crateSeason(
			@ModelAttribute Offer offer,
			BindingResult result,
			@RequestParam String action, Map<String, Object> map,
			HttpServletRequest request){
		
			
	map.put("Offer", new Offer());
	return "create-offer";
		
		
	}
	
	
}
