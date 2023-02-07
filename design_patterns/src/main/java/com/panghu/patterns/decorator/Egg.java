package com.panghu.patterns.decorator;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/21 20:16
 * @description
 */
public class Egg extends Garnish{
    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
