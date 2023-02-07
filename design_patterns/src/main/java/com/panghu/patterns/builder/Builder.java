package com.panghu.patterns.builder;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/19 13:39
 * @description
 */
public abstract class Builder {
    protected Bike bike = new Bike();
    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();

}
