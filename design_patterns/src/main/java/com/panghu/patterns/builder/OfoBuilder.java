package com.panghu.patterns.builder;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/19 13:44
 * @description
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
