package com.in28minutes.learn_spring_framework.game;

public class MarioGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("Mario Jump");
	}

	@Override
	public void down() {
		System.out.println("Mario Down");
	}

	@Override
	public void left() {
		System.out.println("Mario Left");
	}

	@Override
	public void right() {
		System.out.println("Mario Right");
	}

}
