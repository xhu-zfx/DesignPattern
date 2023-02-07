package com.panghu.patterns.interpret;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/13 9:55
 * @description 假发表达式类
 */
public class Plus extends AbstractExpression{
    private AbstractExpression left;
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" +
                left.toString()+
                " + " +
                right.toString()+
                ")";
    }

}
