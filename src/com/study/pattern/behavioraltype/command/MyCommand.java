package com.study.pattern.behavioraltype.command;

/**
 * 命令模式（Command）
 * Created by panxiaoming on 17/1/27.
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
