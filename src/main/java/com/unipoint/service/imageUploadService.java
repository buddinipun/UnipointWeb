package com.unipoint.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

public interface imageUploadService {
	
	public void saveFileToLocalDisk(MultipartFile multipartFile)throws IOException, FileNotFoundException;
	public String getDestinationLocation();
	public ArrayList<String> listFiles(String filename);
	public String getOutputFilename(MultipartFile multipartFile);
	public String getUploadedFileInfo(MultipartFile file) throws IOException;
}
