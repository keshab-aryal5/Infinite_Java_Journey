package com.in28minutes.learn_spring_framework.game;

public class GameRunner {
	MarioGame game;

	public GameRunner(MarioGame marioGame) {
		this.game = marioGame;
	}

	public void run() {
		game.up();
		game.down();
		game.right();
		game.left();
	}

}
