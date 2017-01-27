package com.study.pattern.behavioraltype.interpreter;

/**
 * Created by panxiaoming on 17/1/27.
 */
public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
