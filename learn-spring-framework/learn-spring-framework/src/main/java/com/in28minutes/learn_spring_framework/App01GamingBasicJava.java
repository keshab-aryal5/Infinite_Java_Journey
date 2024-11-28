package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var superContraGame = new SuperContraGame();
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
	}

}
