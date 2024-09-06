package com.project.springFramework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Supercontra implements GamingConsole {
	public void up() {
		System.out.println("Supercontra is Up");
	}

	public void down() {
		System.out.println("Supercontra sitdwon");
	}

	public void left() {
		System.out.println("Supercontra is shooting bullet");
	}

	public void right() {
		System.out.println("Supercontra is accelarate");
	}
}
