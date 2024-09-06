package com.project.springFramework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
//MarioGame game;
//Supercontra game;
	//Packman game;
	GamingConsole game;

	public GameRunner(@Qualifier("MariagameQualifier")
GamingConsole game) {
		this.game = game;
		System.out.println("Running game :" + game);
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
