package com.study.pattern.behavioraltype.memento;

/**
 * 备忘录模式（Memento）
 * Created by panxiaoming on 17/1/27.
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
