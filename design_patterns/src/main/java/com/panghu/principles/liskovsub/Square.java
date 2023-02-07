package com.panghu.principles.liskovsub;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/8 17:00
 * @description 正方形类
 */
public class Square extends Rectangle{
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }
}
