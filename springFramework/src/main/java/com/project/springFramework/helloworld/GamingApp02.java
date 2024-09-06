
package com.project.springFramework.helloworld;

import java.sql.Array;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.springFramework.game.GameRunner;
import com.project.springFramework.game.MarioGame;
import com.project.springFramework.game.Packman;
import com.project.springFramework.game.Supercontra;

public class GamingApp02 {

	public static void main(String[] args) {

		// Launch the spring context
		// Configure the things that we want spring to manage- approach is to making
		// class as @configure
		try (
		var context = new AnnotationConfigApplicationContext(CongiurationClass.class);){
		System.out.println("name() :"+context.getBean("name"));
		System.out.println("age() :"+context.getBean("age"));
		System.out.println("peron() :"+context.getBean("peron"));
		//System.out.println(context.getBean("adrs"));
		//System.out.println("Custom Bean name :"+context.getBean("address"));
		//instead of passing attributes/name of the bean we can directly pass class or type of the bean
			System.out.println(context.getBean(Person.class));
		System.out.println("Type of bean : "+context.getBean(Address.class));
System.out.println("Method calling or reusing the existing bean :"+context.getBean("person2Methodcall"));
System.out.println("variable using  or reusing the existing bean :"+context.getBean("person3Methodcall"));

Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


		}

	}

}
