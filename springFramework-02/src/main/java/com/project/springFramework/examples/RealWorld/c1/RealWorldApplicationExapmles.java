package com.project.springFramework.examples.RealWorld.c1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class RealWorldApplicationExapmles {
	
	
	public static void main(String[] args) {
	var context =new AnnotationConfigApplicationContext(RealWorldApplicationExapmles.class);
	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

	System.out.println(
			context.getBean(BuisnessServiceCalculation.class).findMax());
	
	}

}
