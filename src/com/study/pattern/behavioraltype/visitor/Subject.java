package com.study.pattern.behavioraltype.visitor;

/**
 * Created by panxiaoming on 17/1/27.
 */
public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
