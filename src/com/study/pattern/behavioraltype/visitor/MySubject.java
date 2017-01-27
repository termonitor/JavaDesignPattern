package com.study.pattern.behavioraltype.visitor;

/**
 * 访问者模式（Visitor）
 * Created by panxiaoming on 17/1/27.
 */
public class MySubject implements Subject {

    @Override
    public String getSubject() {
        return "love";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
