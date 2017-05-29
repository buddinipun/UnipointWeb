package com.unipoint.service.impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.unipoint.service.imageUploadService;

@Service
public class imageUploaderImpl implements imageUploadService {
	ArrayList<String> list=new ArrayList<String>();
	@SuppressWarnings("unused")
	public void saveFileToLocalDisk(MultipartFile multipartFile)
            throws IOException, FileNotFoundException {

     String outputFileName = getOutputFilename(multipartFile);
     
     FileCopyUtils.copy(multipartFile.getBytes(), new FileOutputStream(
                  outputFileName));
     
     ArrayList<String> arr = listFiles(outputFileName);
     
     System.out.println("Uploaded image array is ..........."+ arr);
     
}
	
	public String getOutputFilename(MultipartFile multipartFile) {

        return getDestinationLocation() + multipartFile.getOriginalFilename();
 }
	
	public String getUploadedFileInfo(MultipartFile multipartFile)
            throws IOException {

    return multipartFile.getOriginalFilename();
}
	
	public String getDestinationLocation() {
		
	    return "C:/Users/BuddhiNipun/Desktop/images/";
	}
	


public ArrayList<String> listFiles(String filename) {
	 
	 list.add(filename);
	 return list;
}
	

}
