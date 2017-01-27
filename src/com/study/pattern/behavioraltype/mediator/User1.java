package com.study.pattern.behavioraltype.mediator;

/**
 * Created by panxiaoming on 17/1/27.
 */
public class User1 extends User {

    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
