package com.study.pattern.structuraltype.adapter;

/**
 * 对象的适配器模式
 * Created by panxiaoming on 17/1/27.
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method2() {
        System.out.println("this is targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}
