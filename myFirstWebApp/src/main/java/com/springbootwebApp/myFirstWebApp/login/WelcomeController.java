package com.springbootwebApp.myFirstWebApp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")// we need use this annotation across all controller

//when  we are using Model it will visible or redirect in jsp because we have used it.it is availble only for the specific request.if it want it to live longer we need something called session,
//whenever we reatin values accross certain request ,one of the request is session.

public class WelcomeController {
	
	
	@RequestMapping(value ="/",method=RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		//model.put("name", "harshith"); Hardcoded 
		model.put("name", getLoggedInUserName());//spring authenticate
		return "welcomepage";
	}
	//front validation -adding required feild in jsp or html file
	private String getLoggedInUserName() {
		Authentication authenticate = 
				
				SecurityContextHolder.getContext().getAuthentication();
				return authenticate.getName();
	}
}
