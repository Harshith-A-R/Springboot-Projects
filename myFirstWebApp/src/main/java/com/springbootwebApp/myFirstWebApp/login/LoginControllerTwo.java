/*package com.springbootwebApp.myFirstWebApp.login;

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

public class LoginControllerTwo {
	
	public AuthenticateService authService ;
	
	public LoginControllerTwo(AuthenticateService authService) {
		super();
		this.authService = authService;
	}
	@RequestMapping(value ="login-Page2", method  =RequestMethod.GET)
	public String loginPageTwo() {
		return "loginpagetwo";
	}
	//front validation -adding required feild in jsp or html file
	@RequestMapping(value ="login-Page2", method  =RequestMethod.POST)
	public String welcomePageTwo(@RequestParam String name, String password,ModelMap model) {
		
		if (authService.authenticate(name, password)) {
		model.put("name", name);
		model.put("password", password);
		
		return "welcomepage";
	}
		model.put("errormessage", "please try with correct credentials");
	return "loginpagetwo" ;
}
}
*/