package com.study.pattern.createtype.factorymethod;

/**
 * 静态工厂方法模式
 * Created by panxiaoming on 17/1/26.
 */
public class SendFactory2 {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
