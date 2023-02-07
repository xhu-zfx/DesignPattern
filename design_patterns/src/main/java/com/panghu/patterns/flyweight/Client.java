package com.panghu.patterns.flyweight;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/25 16:10
 * @description
 */
public class Client {
    public static void main(String[] args) {
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("粉色");
        AbstractBox box2 = BoxFactory.getInstance().getShape("L");
        box2.display("白色");
        AbstractBox box3 = BoxFactory.getInstance().getShape("O");
        box3.display("红色");
        AbstractBox box4 = BoxFactory.getInstance().getShape("O");
        box4.display("灰色");
        System.out.println(box3 == box4);
    }
}
