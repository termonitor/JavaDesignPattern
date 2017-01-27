package com.study.pattern.createtype.abstractfactory;

import com.study.pattern.createtype.factorymethod.MailSender;
import com.study.pattern.createtype.factorymethod.Sender;

/**
 * Created by panxiaoming on 17/1/26.
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
