package com.study.pattern.structuraltype.decorator;

/**
 * 装饰模式
 * Created by panxiaoming on 17/1/27.
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
