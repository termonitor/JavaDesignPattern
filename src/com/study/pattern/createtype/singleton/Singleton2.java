package com.study.pattern.createtype.singleton;

/**
 * 将创建和getInstance()分开，单独为创建加synchronized关键字
 * Created by panxiaoming on 17/1/26.
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new Singleton2();
        }
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}
