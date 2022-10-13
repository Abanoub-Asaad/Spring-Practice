package com.SpringDemo.learnspringframework.game;

import org.springframework.stereotype.Component;
@Component
public class MarioGame implements IGamingConsole {
    @Override
    public void up() {
        System.out.println("Jump");
    }
    @Override
    public void down() {
        System.out.println("Go into a hole");
    }
    @Override
    public void left() {
        System.out.println("Stop");
    }
    @Override
    public void right() {
        System.out.println("Go fast");
    }
}
