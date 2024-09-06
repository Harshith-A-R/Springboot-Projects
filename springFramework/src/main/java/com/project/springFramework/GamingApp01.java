package com.project.springFramework;

import com.project.springFramework.game.GameRunner;
import com.project.springFramework.game.MarioGame;
import com.project.springFramework.game.Packman;
import com.project.springFramework.game.Supercontra;

public class GamingApp01 {

	public static void main(String[] args) {

		/*
		 * TightCoupling When we want to run particular game (mario/supercontra) we have
		 * make changes in gamerunner class by passing games instance variables and
		 * every time we have to make changes in gameruuner class
		 */
		//TightlyCoupling
		/*
		 * var marioGame = new MarioGame(); 
		 * var supercontra = new Supercontra(); 
		 * var packman = new Packman(); 
		 * var gameRunner = new GameRunner(supercontra);
		 * gameRunner.run();
		 */
		
		/*
		 * The below are example for loosly coupling ,here we are creating one gane
		 * console interface for all game classes to implements the interface and we
		 * just make small changes in the below variable we can run the code here we can
		 * directly pass game varible or making all games variable as "game" and passing
		 * into gamme runner class by uncommenting the instances
		 */
		
		//LooslyCoupling
		//Gmerunner class is no longer coupled with any specific game class it is only coupled with game console interface
		
		//var game = new MarioGame();
		//var game = new Supercontra();
		var game = new Packman();// 1)object Creation
		var gameRunner = new GameRunner(game);//2)Object creation + Wiring the Dependencies in it
		System.out.println("gameRunner" +gameRunner);
		gameRunner.run();
		
	}

}
