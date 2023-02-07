package com.panghu.principles.liskovsub;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/8 17:02
 * @description
 */
public class RectangleDemo {
    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        // 扩宽
        resize(rectangle);
        // 打印
        printLenAndWid(rectangle);
        System.out.println("-------------------------------");
        // 创建正方形对象
        Square square = new Square();
        square.setWidth(10);
        resize(square);
        printLenAndWid(square);
    }

    // 拓宽方法
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLenAndWid(Rectangle rectangle){
        System.out.println("长为：" + rectangle.getLength());
        System.out.println("宽为：" + rectangle.getWidth());
    }
}
