package com.project.springFramework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MariagameQualifier")//it will specific bean to be auto wired
public class MarioGame implements GamingConsole {

	public void up() {
		System.out.println("Up");
	}

	public void down() {
		System.out.println("down");
	}

	public void left() {
		System.out.println("backward");
	}

	public void right() {
		System.out.println("moveforward /accelarate");
	}

}
