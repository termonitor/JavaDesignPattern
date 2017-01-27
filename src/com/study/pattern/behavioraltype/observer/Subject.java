package com.study.pattern.behavioraltype.observer;

/**
 * Created by panxiaoming on 17/1/27.
 */
public interface Subject {

    //增加观察者
    public void add(Observer observer);

    //删除观察者
    public void del(Observer observer);

    //通知所有观察者
    public void notifyObservers();

    //自身操作
    public void operation();
}
