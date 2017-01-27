package com.study.pattern.structuraltype.bridge;

/**
 * 桥接模式
 * Created by panxiaoming on 17/1/27.
 */
public abstract class Bridge {
    private Sourceable source;

    public void method() {
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
