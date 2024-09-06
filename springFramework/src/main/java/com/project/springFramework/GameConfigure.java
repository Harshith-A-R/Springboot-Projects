//package com.project.springFramework;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import com.project.springFramework.game.GameRunner;
//import com.project.springFramework.game.GamingConsole;
//import com.project.springFramework.game.Packman;
//import com.project.springFramework.game.Supercontra;
//
//@Configuration
//public class GameConfigure {
//	@Bean
//@Qualifier("packman")
//	public GamingConsole game() {
//		var game = new Packman();// 1)object Creation
//		return game;
//	}
//	@Bean
//	@Primary
//	public GamingConsole game2() {
//		var game = new Supercontra();// 1)object Creation
//		return game;
//	}
//
//	/*
//	 * @Bean
//	 * 
//	 * @Primary public GameRunner gameRunner() { var gameRunnerVar = new
//	 * GameRunner(game2());// 1)object Creation return gameRunnerVar; }
//	 */
//	@Bean
//	public GameRunner gameRunner2(GamingConsole game2) {
//		var gameRunnerVar = new GameRunner(game2);// 1)object Creation
//		return gameRunnerVar;
//	}
//}
