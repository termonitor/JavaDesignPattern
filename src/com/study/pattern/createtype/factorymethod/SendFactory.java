package com.study.pattern.createtype.factorymethod;

/**
 * 普通工厂模式
 * Created by panxiaoming on 17/1/26.
 */
public class SendFactory {

    public Sender produce(String type) {
        if("mail".equals(type)) {
            return new MailSender();
        } else if("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
