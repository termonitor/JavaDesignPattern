package com.study.pattern.createtype.builder;

import com.study.pattern.createtype.factorymethod.MailSender;
import com.study.pattern.createtype.factorymethod.Sender;
import com.study.pattern.createtype.factorymethod.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式（Builder）
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
