package com.study.pattern.structuraltype.proxy;

/**
 * 代理模式
 * Created by panxiaoming on 17/1/27.
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void before() {
        System.out.println("before proxy!");
    }

    private void after() {
        System.out.println("after proxy!");
    }
}
