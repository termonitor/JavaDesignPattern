package com.study.pattern.behavioraltype.memento;

/**
 * 备忘录模式（Memento）
 * Created by panxiaoming on 17/1/27.
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
