package com.study.pattern.abstarctfactory;

import com.study.pattern.factorymethod.Sender;
import com.study.pattern.factorymethod.SmsSender;

/**
 * Created by panxiaoming on 17/1/26.
 */
public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
