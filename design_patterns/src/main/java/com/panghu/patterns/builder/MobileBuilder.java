package com.panghu.patterns.builder;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/19 13:42
 * @description 具体构建者
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
