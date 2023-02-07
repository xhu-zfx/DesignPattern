package com.panghu.patterns.flyweight;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/25 15:59
 * @description
 */
public abstract class AbstractBox {
    public abstract String getShape();
    public void display(String color){
        System.out.println("方块形状：" + getShape() + "，颜色：" + color);
    }
}
