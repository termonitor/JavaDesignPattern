package com.study.pattern.behavioraltype.command;

/**
 * 命令模式（Command）
 * Created by panxiaoming on 17/1/27.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.exe();
    }
}
