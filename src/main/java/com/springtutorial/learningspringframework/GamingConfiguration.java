package com.springtutorial.learningspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springtutorial.learningspringframework.game.GameRunner;
import com.springtutorial.learningspringframework.game.GamingConsole;
import com.springtutorial.learningspringframework.game.PacManGame;


@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	


}
