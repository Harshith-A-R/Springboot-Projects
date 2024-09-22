package com.project.springFramework.examples.a0;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.project.springFramework.game.GameRunner;
import com.project.springFramework.game.GamingConsole;

@Configuration
@ComponentScan
public class SimpleDependencyInjectionexaple
{
	

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(SimpleDependencyInjectionexaple.class);
		
Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		

	}

}
