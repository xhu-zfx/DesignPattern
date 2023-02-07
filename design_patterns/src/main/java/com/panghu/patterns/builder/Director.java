package com.panghu.patterns.builder;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/19 13:45
 * @description
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    // 组装自行车的功能
    public Bike construst(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.bike;
    }
}
