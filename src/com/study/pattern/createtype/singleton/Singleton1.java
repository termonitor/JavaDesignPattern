package com.study.pattern.createtype.singleton;

/**
 * 利用内部类来维护单例的实现
 * Created by panxiaoming on 17/1/26.
 */
public class Singleton1 {
    /* 私有构造方法，防止被实例化 */
    private Singleton1() {
    }

    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory {
        private static Singleton1 instance = new Singleton1();
    }

    /* 获取实例 */
    public static Singleton1 getInstance() {
        return SingletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}
