package com.rest_webservices.restful_webservices.restfulwebservice;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/* @RestController == This is the annotation, which will make this specific controller a rest controller.
We can expose a REST API from here.
And we want to give a specific URL to this specific method.*/

@RestController
public class hellooWorlController {

	private MessageSource messageSource;
	public hellooWorlController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	
	@GetMapping("helloworld")
	 public String helloWorld() {
		 return "Welcome to Apes";
	 }
	
	@GetMapping("hello-world-bean")
	 public HelloWorldBean helloWorldbean() {
		 return new HelloWorldBean("Hello Apes Welcome ");
	 }
	
	@GetMapping(path ="hello-world/path/{name}")
	 public HelloWorldBean helloWorldPath(@PathVariable String name) {
		 return new HelloWorldBean(String.format("hello World, %s", name));
	 }
	
	@GetMapping(path = "/hello-world-internationalized")
	public String helloWorldInternationalized() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale );
		
		//return "Hello World V2"; 
		
		//1:
		//2:
//		- Example: `en` - English (Good Morning)
//		- Example: `nl` - Dutch (Goedemorgen)
//		- Example: `fr` - French (Bonjour)
//		- Example: `de` - Deutsch (Guten Morgen)

	}
	
}
