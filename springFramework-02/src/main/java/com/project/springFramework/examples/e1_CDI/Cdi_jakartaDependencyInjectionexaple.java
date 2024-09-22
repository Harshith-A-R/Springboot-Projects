package com.project.springFramework.examples.e1_CDI;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.project.springFramework.game.GameRunner;
import com.project.springFramework.game.GamingConsole;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BuisnessService {
	private DataService dataservice;
	
	@Inject
	public void setDataservice(DataService dataservice) {
		this.dataservice = dataservice;
	}
	//@Autowired
//@Inject
	public DataService getDataservice() {
		System.out.println("SetterInjection");

		return dataservice;
	}
	
	
}

@Component
class DataService {

}

@Configuration
@ComponentScan
public class Cdi_jakartaDependencyInjectionexaple {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(Cdi_jakartaDependencyInjectionexaple.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BuisnessService.class).getDataservice());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
