package com.in28minutes.learn_spring_framework.game;

public class PacMan implements GamingConsole {
	@Override
	public void up() {
		System.out.println("PacMan Jump");
	}

	@Override
	public void down() {
		System.out.println("PacMan Down");
	}

	@Override
	public void left() {
		System.out.println("PacMan Left");
	}

	@Override
	public void right() {
		System.out.println("PacMan Right");
	}

}
