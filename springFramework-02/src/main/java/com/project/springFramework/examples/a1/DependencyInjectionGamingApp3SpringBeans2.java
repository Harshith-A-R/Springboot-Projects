package com.project.springFramework.examples.a1;

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
@Component
class YouBuisnessClass{
	
	//These are all the field injection
	
	Dependency1 dependency1;
	
	Dependency2 dependency2;
	
	
	public YouBuisnessClass(Dependency1 dependency1, Dependency2 dependency2) {
		
		super();
		System.out.println("Contructor Injection");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	/*@Autowired
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("Setter Injection-01");
		this.dependency1 = dependency1;
	}
	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("Setter Injection-02");

		this.dependency2 = dependency2;
	}*/
	
	//feild injection
	public String toString(){
		return "Using " + dependency1 +" and " +dependency2;
	}

}
@Component
class Dependency1{
	String name ="Harshith";

}
@Component
class Dependency2{
	
}

@Configuration
@ComponentScan
public class DependencyInjectionGamingApp3SpringBeans2 {
	

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DependencyInjectionGamingApp3SpringBeans2.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(YouBuisnessClass.class));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
