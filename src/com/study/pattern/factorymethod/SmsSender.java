package com.study.pattern.factorymethod;

/**
 * Created by panxiaoming on 17/1/26.
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
