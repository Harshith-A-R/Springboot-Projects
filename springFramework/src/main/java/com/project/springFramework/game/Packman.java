package com.project.springFramework.game;

import org.springframework.stereotype.Component;

//@Component
public class Packman implements GamingConsole {
	public void up() {
		System.out.println("Packman is Up");
	}

	public void down() {
		System.out.println("Packman is moving down");
	}

	public void left() {
		System.out.println("Packman is going back direction ");
	}

	public void right() {
		System.out.println("Packman is Moving Forward");
	}

}
