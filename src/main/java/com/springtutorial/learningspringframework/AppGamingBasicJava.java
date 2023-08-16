package com.springtutorial.learningspringframework;

import com.springtutorial.learningspringframework.game.GameRunner;
import com.springtutorial.learningspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
		
	}

}
