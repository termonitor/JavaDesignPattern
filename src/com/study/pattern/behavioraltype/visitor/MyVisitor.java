package com.study.pattern.behavioraltype.visitor;

/**
 * 访问者模式（Visitor）
 * Created by panxiaoming on 17/1/27.
 */
public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject subject) {
        System.out.println("visit the subject: " + subject.getSubject());
    }
}
