package com.study.pattern.facade;

/**
 * 外观模式
 * Created by panxiaoming on 17/1/27.
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startup() {
        System.out.println("start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished!");
    }

    public void shutdown() {
        System.out.println("begin to close the computer!");
        disk.shutdown();
        memory.shutdown();
        cpu.shutdown();
        System.out.println("computer closed!");
    }
}
