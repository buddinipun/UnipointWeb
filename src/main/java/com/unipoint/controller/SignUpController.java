package com.unipoint.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class SignUpController {
	 @RequestMapping(value = "SignUp")
	public String init(){
		 return "signup";
	}

}
