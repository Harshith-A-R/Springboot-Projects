package com.project.springFramework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.project.springFramework.game.GameRunner;
import com.project.springFramework.game.GamingConsole;
import com.project.springFramework.game.MarioGame;
import com.project.springFramework.game.Packman;
import com.project.springFramework.game.Supercontra;

@Configuration
@ComponentScan("com.project.springFramework.game")
public class GamingApp04SpringBeans {
	
	/*
	@Bean
	public GamingConsole game() {
		var game = new Packman();// 1)object Creation
		return game;
	}

	@Bean
	// @Primary
	public GamingConsole game2() {
		var game = new Supercontra();// 1)object Creation
		return game;
	}*/
	
	
	//--------------------------------------------------------------------------------------------------

	// Here we are Right now we are using add bean annotations to manually create
	// the beans.
	// in order to reduce the code
	/*
	 * Let's start with asking Spring
	 * 
	 * to create a PacmanGame for us.
	 * 
	 * Instead of writing this piece of code
	 * 
	 * how can I ask Spring to create the PacmanGame for us?
	 * 
	 * The way you can tell Spring to create a instance
	 * 
	 * of a specific class is by adding an annotation.
	 * 
	 * So I'm going to the PacmanGame class
	 * 
	 * and I would say component, "@Component".
	 * 
	 * This is a component that Spring will manage.
	 * 
	 * Let's do an organized imports,
	 * 
	 * import "org.springframework.stereotype.Component".
	 * 
	 * And if I go over to component, it says,
	 * 
	 * "Indicates that the annotated class is a 'component'.
	 * 
	 * Such classes are considered as candidates
	 * 
	 * for auto-detection when using annotation-based configuration
	 * 
	 * and classpath scanning."
	 * 
	 * So what would happen eventually is that a instance
	 * 
	 * of this PacmanGame will be created by Spring for you.
	 * 
	 * So Spring would start creating objects as well.
	 * 
	 * Let's see if that happens.
	 * 
	 * What I'll do now is I will remove this bean from here.
	 * 
	 * So I'll removing the Pacman bean from here.
	 * 
	 * Let's see if Spring creates it for us.
	 * 
	 * Let's organize inputs as well.
	 * 
	 * Right click, run as Java application.
	 * 
	 * Oops. Error. Spring does not like this.
	 * 
	 * When I run it, I see an exception. What's the exception?
	 * 
	 * No such bean definition exception.
	 * 
	 * Spring is trying to find a gaming console
	 * 
	 * implementation, a game.
	 * 
	 * However, it's not able to find this specific component.
	 * 
	 * However, we already added a component on the PacmanGame.
	 * 
	 * Why's Spring not able to find the PacmanGame?
	 * 
	 * The reason is because we would need to tell Spring
	 * 
	 * where to search for PacmanGame.
	 * 
	 * In here we are creating an configuration file
	 * 
	 * and we are saying this is the bean definition.
	 * 
	 * However, we have defined our component in this package,
	 * 
	 * "com.in28minutes.learnspringframework.game".
	 * 
	 * We'll need to tell Spring framework
	 * 
	 * to go and search for PacmanGame in this specific package.
	 * 
	 * How can I tell Spring which package to search in?
	 * 
	 * That's where you would add something called component scan,
	 * 
	 * so let's add in component scan, "@Component" scan.
	 */

	
	//-----------------------------------------------------------------------------------------
	/*
	 * @Bean public GameRunner gameRunner(GamingConsole game) { var gameRunnerVar =
	 * new GameRunner(game);// 1)object Creation return gameRunnerVar; }
	 * 
	 * @Bean
	 * 
	 * @Primary public GameRunner gameRunner2() { var gameRunnerVar = new
	 * GameRunner(game2());// 1)object Creation return gameRunnerVar; }
	 * 
	 */

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(GamingApp04SpringBeans.class);
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
