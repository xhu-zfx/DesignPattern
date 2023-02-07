package com.panghu.patterns.interpret;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/13 9:52
 * @description 用于封装遍历的类
 */
public class Variable extends AbstractExpression{

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
