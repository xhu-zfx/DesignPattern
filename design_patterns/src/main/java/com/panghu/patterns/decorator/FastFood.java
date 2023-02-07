package com.panghu.patterns.decorator;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/21 19:39
 * @description
 */
public abstract class FastFood {
    private float price;
    private String desc;

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public abstract float cost();
}
