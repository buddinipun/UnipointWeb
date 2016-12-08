package com.unipoint.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UploadController {
	
	@RequestMapping(value="/Upload")
	public String init(){
		
		return "from";
		
	}

}
