package com.study.pattern.behavioraltype.strategy;

/**
 * 策略模式
 * Created by panxiaoming on 17/1/27.
 */
public class Multiply extends AbstractCalculator implements ICaculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp, "\\*");
        return arrayInt[0] * arrayInt[1];
    }
}
