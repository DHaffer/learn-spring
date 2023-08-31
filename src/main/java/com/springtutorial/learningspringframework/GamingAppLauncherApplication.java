package com.springtutorial.learningspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springtutorial.learningspringframework.game.GameRunner;
import com.springtutorial.learningspringframework.game.GamingConsole;
import com.springtutorial.learningspringframework.game.MarioGame;
import com.springtutorial.learningspringframework.game.PacManGame;
import com.springtutorial.learningspringframework.game.SuperContraGame;

@Configuration
@ComponentScan("com.springtutorial.learningspringframework.game")
public class GamingAppLauncherApplication {
		
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
		
	}

}
