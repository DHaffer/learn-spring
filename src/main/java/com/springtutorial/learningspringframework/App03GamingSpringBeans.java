package com.springtutorial.learningspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springtutorial.learningspringframework.game.GameRunner;
import com.springtutorial.learningspringframework.game.GamingConsole;
import com.springtutorial.learningspringframework.game.MarioGame;
import com.springtutorial.learningspringframework.game.PacManGame;
import com.springtutorial.learningspringframework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
		
		
		
		
	}

}
