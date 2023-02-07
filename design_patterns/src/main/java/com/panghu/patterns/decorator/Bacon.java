package com.panghu.patterns.decorator;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/21 20:16
 * @description
 */
public class Bacon extends Garnish{
    public Bacon(FastFood fastFood) {
        super(2, "培根", fastFood);
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
