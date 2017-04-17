package com.idm4j.boot.app.web.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseAPI {

	
	public BaseAPI() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/")
	public String index(){
		
		return "Welcome to IDM4J";
	}
	
	@RequestMapping("/services")
	public String services(){
		
		return "Welcome to IDM4J";
	}

}
