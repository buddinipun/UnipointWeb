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
//	ArrayList<String> list=new ArrayList<String>();
	  ArrayList<String> lIngredients = new ArrayList<String>();
	@Autowired
	private ApplicationContext appContext;
	@RequestMapping(value="/upload.image1", method=RequestMethod.POST)
	
	public void upload(MultipartHttpServletRequest request,
		                     HttpServletResponse response,Map<String, Object> map) throws IOException {
		
           Map<String, MultipartFile> fileMap = request.getFileMap();

        	String filename ="";
        	 for (MultipartFile multipartFile : fileMap.values()) {
        		 saveFileToLocalDisk(multipartFile);
        		 filename = getOutputFilename(multipartFile);
        	 }
        	 
        	 
    
     HttpSession session = request.getSession();
     		lIngredients.add(filename);
    	    session.setAttribute("Ingredientes", lIngredients);
//    	    System.out.println( "session object saved file name"+ session.getAttribute("Ingredientes"));
      
	}
	private void saveFileToLocalDisk(MultipartFile multipartFile)
              throws IOException, FileNotFoundException {

       String outputFileName = getOutputFilename(multipartFile);
//       System.out.println("outputFileName is .... " + outputFileName);
       FileCopyUtils.copy(multipartFile.getBytes(), new FileOutputStream(
                    outputFileName));
       
}
		
	private String getUploadedFileInfo(MultipartFile multipartFile)
              throws IOException {

      return multipartFile.getOriginalFilename();
}
	private String getOutputFilename(MultipartFile multipartFile) {
//		System.out.println("File locations is ....." + getDestinationLocation() + multipartFile.getOriginalFilename());
        return getDestinationLocation() + multipartFile.getOriginalFilename();
 }
	
private String getDestinationLocation() {
	
    return "C:/Users/BuddhiNipun/Desktop/images/";
}


	
	
}
	


