package com.project.springFramework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//first we create Person class by passing constructor attributes after that we added address as well
record Person(String name, int age, Address address) {
}

record Address(String area, String city) {
}

@Configuration
public class CongiurationClass {
	@Bean
	public String name() {
		return "Harshith";
	}

	@Bean
	public int age() {
		return 26;
	}

	@Bean
	
	public Person peron() {
		/*
		 * var person = new Person("ragnor",56); return person;
		 */
		return new Person("ragnor", 56,
				new Address("mandkeri", "Karnataka"));

	}

//changing default Bean name to Custom Bean name 

	// relationship between exiasting method
	@Bean
	@Qualifier("anotherwaytomakeimp")
	public Person person2Methodcall() {
		return new Person(name(), age(), address());
	}

	// instaed of calling method directly passing the variable
	@Bean
	@Primary
	public Person person3Methodcall(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}

	@Bean(name = "address2")
	public Address address() {
		return new Address("ITPL", "bengaluru");
	}

	@Bean(name = "address3")
	//Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException: 
	//No qualifying bean of type 'com.project.springFramework.Address' available: expected single matching bean but found 2: address2,address3

	@Primary
	public Address adrs2() {
		return new Address("KRPura", "Mysore");
	}
}
