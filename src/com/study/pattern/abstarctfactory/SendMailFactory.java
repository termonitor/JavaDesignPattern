package com.study.pattern.abstarctfactory;

import com.study.pattern.factorymethod.MailSender;
import com.study.pattern.factorymethod.Sender;

/**
 * Created by panxiaoming on 17/1/26.
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
