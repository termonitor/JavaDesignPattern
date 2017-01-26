package com.study.pattern.factorymethod;

/**
 * Created by panxiaoming on 17/1/26.
 */
public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
