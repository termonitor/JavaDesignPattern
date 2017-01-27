package com.study.pattern.structuraltype.bridge;

/**
 * Created by panxiaoming on 17/1/27.
 */
public class SourceSub1 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
