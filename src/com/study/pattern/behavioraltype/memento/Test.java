package com.study.pattern.behavioraltype.memento;

/**
 * Created by panxiaoming on 17/1/27.
 */
public class Test {

    public static void main(String[] args) {
        //创建原始类
        Original origi = new Original("egg");

        //创建备忘录
        Storage storage = new Storage(origi.createMemento());

        //修改原始类的状态
        System.out.println("初始化状态为:" + origi.getValue());
        origi.setValue("pan");
        System.out.println("修改后状态为:" + origi.getValue());

        origi.restoreMemento(storage.getMemento());
        System.out.println("恢复后状态为:" + origi.getValue());
    }
}
