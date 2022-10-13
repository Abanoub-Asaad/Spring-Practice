package com.SpringDemo.learnspringframework;

import com.SpringDemo.learnspringframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@ComponentScan({"com.SpringDemo", "dummy"})
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//MarioGame, GameRunner
		GameRunner runner = context.getBean(GameRunner.class);
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		//GameRunner runner = new GameRunner(game);
		runner.runGame();
	}
}
