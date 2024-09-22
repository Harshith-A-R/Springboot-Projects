package com.project.springFramework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
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
