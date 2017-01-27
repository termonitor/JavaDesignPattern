package com.study.pattern.behavioraltype.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 观察者模式（Observer）
 * Created by panxiaoming on 17/1/27.
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> vector = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while(enumo.hasMoreElements()) {
            enumo.nextElement().update();
        }
    }
}
