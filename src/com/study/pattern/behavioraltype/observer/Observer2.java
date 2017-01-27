package com.study.pattern.behavioraltype.observer;

/**
 * Created by panxiaoming on 17/1/27.
 */
public class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
