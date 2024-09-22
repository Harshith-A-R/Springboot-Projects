package com.springbootwebApp.myFirstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
// this web UI related we need to spring that ,this is spring request something which is handles web request we need to annotation called controller like @ component for searching beans
//someone nmeeds to tell this is bean 
public class SayHelloController {

	@RequestMapping("say-hello")
	@ResponseBody // it will retuen whatever in here as ease to browser
	public String sayHello() {
		return "Hello ! This is Harshith World";
		
	}
	//manging this code is really complex
	/*
	 * Managing this code will become really tough over a period of time, and that's
	 * why we go for something
	 * called views.
	 * And one of the most popular view technologies is something called jSP Java
	 * Server pages.
	 */
	
	
	
	//hard coded HTML page
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page - Changed</title>");
		sb.append("</head>");
		sb.append("<body><b>");
		sb.append("My first html page with body - Changed");
		sb.append("</b></body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	@RequestMapping("say-hello-jsp")
	//@ResponseBody // it will retuen whatever in here as ease to browser .
	//here it will return only 
	public String sayHelloJsp() {
		return "sayHello";//here it should return jsp page name if you change it any other string it will return response as 404 error 
		
	}
	@RequestMapping("calling-method")
	@ResponseBody
	public String add() {
		return sayHello(); 
	}
}
