package com.study.pattern.builder;

import com.study.pattern.factorymethod.MailSender;
import com.study.pattern.factorymethod.Sender;
import com.study.pattern.factorymethod.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by panxiaoming on 17/1/26.
 */
public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count) {
        for(int i=0; i<count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for(int i=0; i<count; i++) {
            list.add(new SmsSender());
        }
    }

}
