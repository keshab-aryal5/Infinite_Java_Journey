package com.in28minutes.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("SuperContra Jump");
	}

	@Override
	public void down() {
		System.out.println("SuperContra Down");
	}

	@Override
	public void left() {
		System.out.println("SuperContra Left");
	}

	@Override
	public void right() {
		System.out.println("SuperContra Right");
	}
}
