package com.study.pattern.behavioraltype.memento;

/**
 * 备忘录模式（Memento）
 * Created by panxiaoming on 17/1/27.
 */
public class Original {

    private String value;

    public Original(String value) {
        this.value = value;
    }

    public Memento createMemento() {
        return new Memento(value);
    }

    public void restoreMemento(Memento memento) {
        this.value = memento.getValue();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
