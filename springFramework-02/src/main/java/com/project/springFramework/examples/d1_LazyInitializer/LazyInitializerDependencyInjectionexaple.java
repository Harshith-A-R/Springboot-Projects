package com.project.springFramework.examples.d1_LazyInitializer;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.project.springFramework.game.GameRunner;
import com.project.springFramework.game.GamingConsole;

@Component
class NormalScopes {

}

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE )
class Prototypecopes {

}

@Configuration
@ComponentScan
public class LazyInitializerDependencyInjectionexaple {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(LazyInitializerDependencyInjectionexaple.class);
		// context.getBean(ClassB.class).doSomething();
//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(Prototypecopes.class));

		System.out.println(context.getBean(Prototypecopes.class));

		System.out.println(context.getBean(Prototypecopes.class));

		System.out.println(context.getBean(Prototypecopes.class));

		System.out.println(context.getBean(NormalScopes.class));
		System.out.println(context.getBean(NormalScopes.class));

		System.out.println(context.getBean(NormalScopes.class));
		System.out.println(context.getBean(NormalScopes.class));

	}

}
