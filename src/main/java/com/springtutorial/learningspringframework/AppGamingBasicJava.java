package com.springtutorial.learningspringframework;

import com.springtutorial.learningspringframework.game.GameRunner;
import com.springtutorial.learningspringframework.game.MarioGame;
import com.springtutorial.learningspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		//var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
		
	}

}
