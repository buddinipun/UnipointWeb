package com.unipoint.controller;
import java.io.File;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.unipoint.model.LoyaltyScheme;
import com.unipoint.service.SchemaSrvices;
@Controller
public class DefineSchemeController {

	@Autowired
	SchemaSrvices schemaservices;
	
	@RequestMapping(value="/Schema")
	public String init(Map<String, Object> map){
		
		map.put("LoyaltyScheme", new LoyaltyScheme());
		map.put("LoyaltySchemas",schemaservices.getAllSchemes());
		return "define_schemes";
		
	}
	
	@RequestMapping(value="/schema.define", method=RequestMethod.POST)
	public String doActions(
			@ModelAttribute LoyaltyScheme loyaltyScheme,
			BindingResult result,
			@RequestParam String action, Map<String, Object> map,
			@RequestParam("file") MultipartFile[] uploadfiles,
			HttpServletRequest request){
			
		  
		    
		switch(action.toLowerCase()){
		case "add":
			  saveFile(uploadfiles, request,loyaltyScheme);
		      schemaservices.addSchema(loyaltyScheme);
		   
			break;
		case "edit":
			
			break;
		case "delete":
			System.out.println("sucess");
			schemaservices.deleteSchema(loyaltyScheme);
			break;
		case "search":
			
			break;
		}
		
		map.put("LoyaltySchemas",schemaservices.getAllSchemes());
		map.put("LoyaltyScheme", new LoyaltyScheme());
		return "define_schemes";
	}
	
	
	private void saveFile(MultipartFile[] uploadFiles,HttpServletRequest request,LoyaltyScheme scheme){
		    String uploadsDir = "/uploads/";
			for (int i = 0; i < uploadFiles.length; i++) {

			 String realPathtoUploads =  request.getServletContext().getRealPath(uploadsDir);
	         if(!new File(realPathtoUploads).exists())
	         {
	        	 System.out.println("created");
	             new File(realPathtoUploads).mkdir();
	         }
			
	        
	         String orgName = uploadFiles[i].getOriginalFilename();
	         String filePath = realPathtoUploads + orgName;
	         File dest = new File(filePath);
	         		try {
					uploadFiles[i].transferTo(dest);
					scheme.setImageUrl("uploads/"+orgName);
					}catch (Exception e) {
					e.printStackTrace();
				}
			}
	}
	
	
}
