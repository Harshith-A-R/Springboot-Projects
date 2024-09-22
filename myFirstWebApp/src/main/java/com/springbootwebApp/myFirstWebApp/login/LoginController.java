package com.springbootwebApp.myFirstWebApp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller // this web UI related we need to spring that ,this is spring request something which is handles web request we need to annotation called controller like @ component for searching beans
public class LoginController {
private Logger logger =LoggerFactory.getLogger(this.getClass());
	@RequestMapping("login")
	//@ResponseBody // it will retuen whatever in here as ease to browser
	//How request parameter works 
	//@RequestParam //http://localhost:8080/login?id=12 whenever we gets a parameter  request from web we should What do we pass as a query parameter?
	//You can accept it in your controller method using the annotation add request param.
	//if we want to print the same parameter in console we pass the same string variable forexample "name=harsha we shouold pass name in it here 
	public String loginPage(@RequestParam int id,ModelMap model) {
		model.put("io", id);
		logger.debug("Request param of Debug {}"+id);
		logger.warn("Request param of warn {}"+id);

		System.out.println("Request Param is"+ id);
		return "loginpage";
		
		//model is To show it in your JSP, you need to put it into something called a modal.
		//Once you put it into the model, the view can automatically pick it up.
		
	}
	@RequestMapping("loginpage2")
	public String loginpage2(@RequestParam String name,ModelMap model) {
		model.put("name", name);
		logger.debug("Parameter is"+name);
		System.out.println("request Param is"+name  );
		return "loginpage";
	}
	
}
