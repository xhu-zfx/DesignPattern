package com.panghu.patterns.interpret;


/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/13 10:24
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        // 创建多个对象
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        // 将遍历存储到环境对象中
        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);
        AbstractExpression expression = new Minus(a,new Plus(b,new Minus(d,c)));
        int res = expression.interpret(context);
        System.out.println(expression + " = " + res);
    }
}
