package com.study.pattern.factorymethod;

/**
 * 多个工厂方法模式
 * Created by panxiaoming on 17/1/26.
 */
public class SendFactory2 {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
