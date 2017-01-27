package com.study.pattern.createtype.factorymethod;

/**
 * Created by panxiaoming on 17/1/26.
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is mail sender!");
    }
}
