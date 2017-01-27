package com.study.pattern.proxy;

/**
 * Created by panxiaoming on 17/1/27.
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
