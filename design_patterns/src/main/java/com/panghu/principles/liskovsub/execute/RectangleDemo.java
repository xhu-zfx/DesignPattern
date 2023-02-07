package com.panghu.principles.liskovsub.execute;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/8 17:22
 * @description
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLenAndWid(rectangle);
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
