package com.study.pattern.bridge;

/**
 * 桥接模式
 * Created by panxiaoming on 17/1/27.
 */
public class MyBridge extends Bridge {
    public void method() {
        getSource().method();
    }
}
