package com.study.pattern.behavioraltype.templatemethod;

/**
 * 模板方法模式
 * Created by panxiaoming on 17/1/27.
 */
public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
