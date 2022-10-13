package com.SpringDemo.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements IGamingConsole {
    @Override
    public void up() {
        System.out.println("up");
    }
    @Override
    public void down() {
        System.out.println("down");
    }
    @Override
    public void left() {
        System.out.println("left");
    }
    @Override
    public void right() {
        System.out.println("right");
    }
}