package com.panghu.patterns.facade;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/23 15:09
 * @description
 */
public class SmartApplicationsFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartApplicationsFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }
    public void say(String message){
        if (message.contains("打开")){
            on();
        } else if (message.contains("关闭")){
            off();
        }
    }

    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }

    private void on() {
        light.on();
        tv.on();
        airCondition.on();

    }
}
