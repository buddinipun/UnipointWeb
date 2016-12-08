package com.unipoint.controller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.unipoint.model.Offer;

import org.springframework.util.FileCopyUtils;



@Controller
public class imgeUploader {
	
	@Autowired
	private ApplicationContext appContext;
	@RequestMapping(value="/upload.image1", method=RequestMethod.POST)
	
			
			public ModelAndView upload(MultipartHttpServletRequest request,
		                     HttpServletResponse response,Map<String, Object> map) throws IOException {
			
		 // Getting uploaded files from the request object
        Map<String, MultipartFile> fileMap = request.getFileMap();
//        	System.out.println(fileMap + "budiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        	String filename ="";
        	 for (MultipartFile multipartFile : fileMap.values()) {
        		 saveFileToLocalDisk(multipartFile);
        		 //System.out.println(multipartFile.getOriginalFilename());
        		 filename = getUploadedFileInfo(multipartFile);
//        		 System.out.println("filename is ...." + filename + "budiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        		 
        	 }
        	 

       ModelAndView view = new ModelAndView("create-offer"); 
       map.put("filename",filename);
      
//       System.out.println(filename);
       
       
       HttpSession session = request.getSession();
       ArrayList<String> lIngredients = (ArrayList<String>) session.getAttribute("Ingredientes");
       if (lIngredients == null) {
    	    lIngredients = new ArrayList<>();
    	    lIngredients.add(filename);
    	    session.setAttribute("Ingredientes", lIngredients);
    	}
       lIngredients.add(filename);
//       System.out.println(list);
       System.out.println( session.getAttribute("Ingredientes"));
       view.addObject("filename",filename); 
       
       view.addObject("Offer",new Offer());
       return view;
	}
	
	 
	private void saveFileToLocalDisk(MultipartFile multipartFile)
              throws IOException, FileNotFoundException {

       String outputFileName = getOutputFilename(multipartFile);

       FileCopyUtils.copy(multipartFile.getBytes(), new FileOutputStream(
                    outputFileName));
}
	  
	  
	private String getUploadedFileInfo(MultipartFile multipartFile)
              throws IOException {

      return multipartFile.getOriginalFilename();
}
	
	private String getOutputFilename(MultipartFile multipartFile) {

        return getDestinationLocation() + multipartFile.getOriginalFilename();
 }
	
private String getDestinationLocation() {
	
    return "C:/Users/BuddhiNipun/Desktop/images/";
}
	

	
	
}
	


