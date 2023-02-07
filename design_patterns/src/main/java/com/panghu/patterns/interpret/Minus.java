package com.panghu.patterns.interpret;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/13 10:18
 * @description
 */
public class Minus extends AbstractExpression{
    private AbstractExpression left;
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" +
                left.toString()+
                " - " +
                right.toString()+
                ")";
    }

}
