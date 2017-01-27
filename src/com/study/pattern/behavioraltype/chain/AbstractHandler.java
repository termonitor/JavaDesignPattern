package com.study.pattern.behavioraltype.chain;

/**
 * Created by panxiaoming on 17/1/27.
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
