package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacMan;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		//var marioGame=new MarioGame();
		//var game = new PacMan();
		var game=new SuperContraGame();
		var gameRunner=new GameRunner(game);
		gameRunner.run();
		
	}

}
 