package com.study.pattern.abstarctfactory;

import com.study.pattern.factorymethod.Sender;

/**
 * Created by panxiaoming on 17/1/26.
 */
public interface Provider {
    public Sender produce();
}
