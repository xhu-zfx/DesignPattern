package com.panghu.patterns.decorator;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/21 19:47
 * @description 装饰者类(抽象装饰着角色)
 */
public abstract class Garnish extends FastFood{
    // 声明快餐类的变量
    private FastFood fastFood;

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
