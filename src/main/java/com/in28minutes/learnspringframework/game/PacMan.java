package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole {
	public void up() {
		System.out.println("Jump Pacman");
	}
	public void down() {
		System.out.println("Go into a hole Pacman");
	}
	public void left() {
		System.out.println("Go back Pacman");
	}
	public void right() {
		System.out.println("Accelarate Pacman");
	}


}
