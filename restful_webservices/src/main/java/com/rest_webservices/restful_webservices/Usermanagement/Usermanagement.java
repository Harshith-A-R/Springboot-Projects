package com.rest_webservices.restful_webservices.Usermanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usermanagement {
	  
	@GetMapping ("/home")
	public String homePage() {
		
		return "Welcome Home";
	}
}
