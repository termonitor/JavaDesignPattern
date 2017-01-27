package com.study.pattern.behavioraltype.observer;

/**
 * 观察者模式（Observer）
 * Created by panxiaoming on 17/1/27.
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
