package com.project.springFramework.examples.d1_LazyInitializer;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.project.springFramework.game.GameRunner;
import com.project.springFramework.game.GamingConsole;
@Component
class ClassA{
	
}
@Component
@Lazy
class ClassB{
	ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("LAzy Annotation");
		this.classA=classA;
	}
	public void doSomething() {
		System.out.println("DoSomething working after initializatokn");
	}
}
@Configuration
@ComponentScan
public class BeanScopesDependencyInjectionexaple2
{
	

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(BeanScopesDependencyInjectionexaple2.class)) {
		System.out.println("initialization completed");
			context.getBean(ClassB.class).doSomething();
		}
		

	}

}
