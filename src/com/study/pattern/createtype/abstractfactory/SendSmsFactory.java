package com.study.pattern.createtype.abstractfactory;

import com.study.pattern.createtype.factorymethod.Sender;
import com.study.pattern.createtype.factorymethod.SmsSender;

/**
 * Created by panxiaoming on 17/1/26.
 */
public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
