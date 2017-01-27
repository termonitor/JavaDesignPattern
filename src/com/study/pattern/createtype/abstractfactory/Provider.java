package com.study.pattern.createtype.abstractfactory;

import com.study.pattern.createtype.factorymethod.Sender;

/**
 * Created by panxiaoming on 17/1/26.
 */
public interface Provider {
    public Sender produce();
}
