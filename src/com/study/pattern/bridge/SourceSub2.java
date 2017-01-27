package com.study.pattern.bridge;

/**
 * Created by panxiaoming on 17/1/27.
 */
public class SourceSub2 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }
}
