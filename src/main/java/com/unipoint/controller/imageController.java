package com.unipoint.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.unipoint.service.imageUploadService;

@Controller
public class imageController {

	
	ArrayList<String> list=new ArrayList<String>();
	@Autowired
	private ApplicationContext appContext;
	imageUploadService imageservice;
	@RequestMapping(value="/upload.image", method=RequestMethod.POST)
			
	public void upload(MultipartHttpServletRequest request,
		                     HttpServletResponse response,Map<String, Object> map) throws IOException {
			
           Map<String, MultipartFile> fileMap = request.getFileMap();

        	String filename ="";
        	
        	 for (MultipartFile multipartFile : fileMap.values()) {
        		 imageservice.saveFileToLocalDisk(multipartFile);
        		 
//        		 filename = imageservice.getUploadedFileInfo(multipartFile);
        		 System.out.println(filename + "name of uploaded image");
        		 
//        		 System.out.println(listFiles(filename) + "list of uploaded images ..... ");
        	 }
}
	
}
