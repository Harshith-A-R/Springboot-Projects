//package com.project.springFramework;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.project.springFramework.game.GameRunner;
//import com.project.springFramework.game.GamingConsole;
//import com.project.springFramework.game.MarioGame;
//import com.project.springFramework.game.Packman;
//import com.project.springFramework.game.Supercontra;
//
//public class GamingApp3SpringBeans {
//
//	public static void main(String[] args) {
//
//		var context =
//				new AnnotationConfigApplicationContext
//				(GameConfigure.class);
//		context.getBean(GamingConsole.class).up();
//		context.getBean(GameRunner.class).run();
//		context.getBean(GameRunner.class ).run();
//
//
//		
//		/*
//		 * var game = new Packman();// 1)object Creation var gameRunner = new
//		 * GameRunner(game);//2)Object creation + Wiring the Dependencies in it
//		 * gameRunner.run();
//		 */
//		
//	}
//
//}
