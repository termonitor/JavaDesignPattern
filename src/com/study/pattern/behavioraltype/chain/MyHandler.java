package com.study.pattern.behavioraltype.chain;

/**
 * 责任链模式（Chain of Responsibility）
 * Created by panxiaoming on 17/1/27.
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + "deal!");
        if(getHandler() != null) {
            getHandler().operator();
        }
    }
}
