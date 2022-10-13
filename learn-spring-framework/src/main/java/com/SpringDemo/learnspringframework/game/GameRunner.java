package com.SpringDemo.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class GameRunner {

    @Autowired
    private IGamingConsole game;

    /*public void setGame(IGamingConsole iGamingConsole) {
        System.out.println("Using Setter");
        this.game = iGamingConsole;
    }*/
    /*public GameRunner(IGamingConsole game) {
        System.out.println("Using Constructor");
        this.game = game;
    }*/
    public void runGame() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}