package com.study.pattern.createtype.factorymethod;

/**
 * 多个工厂方法模式
 * Created by panxiaoming on 17/1/26.
 */
public class SendFactory1 {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
