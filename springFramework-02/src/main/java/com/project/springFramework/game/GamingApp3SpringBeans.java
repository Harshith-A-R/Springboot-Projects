package com.project.springFramework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("package com.project.springFramework.game;\r\n")
public class GamingApp3SpringBeans {
	/*
	 * @Bean // @Qualifier("packman") public GamingConsole game() { var game = new
	 * Packman();// 1)object Creation return game; }
	 */

	/*
	 * @Bean public GamingConsole game2() { var game = new Supercontra();// 1)object
	 * Creation return game; }
	 * 
	 *//*
		 * @Bean
		 * 
		 * @Primary public GameRunner gameRunner() { var gameRunnerVar = new
		 * GameRunner(game2());// 1)object Creation return gameRunnerVar; }
		 */
	/*
	 * @Bean public GameRunner gameRunner2(GamingConsole game2) { var gameRunnerVar
	 * = new GameRunner(game2);// 1)object Creation return gameRunnerVar; }
	 */

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(GamingApp3SpringBeans.class);
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
		context.getBean(GameRunner.class).run();

		/*
		 * var game = new Packman();// 1)object Creation var gameRunner = new
		 * GameRunner(game);//2)Object creation + Wiring the Dependencies in it
		 * gameRunner.run();
		 */

	}

}
