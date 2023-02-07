package com.panghu.principles.liskovsub.execute;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/8 17:21
 * @description
 */
public class Rectangle implements Quadrilateral{
    double length;
    double width;
    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
