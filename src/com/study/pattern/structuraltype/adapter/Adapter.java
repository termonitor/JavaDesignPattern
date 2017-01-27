package com.study.pattern.structuraltype.adapter;

/**
 * 类的适配器模式
 * Created by panxiaoming on 17/1/27.
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
