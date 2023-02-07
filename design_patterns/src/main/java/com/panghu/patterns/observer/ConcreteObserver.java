package com.panghu.patterns.observer;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/9 16:30
 * @description 具体观察者角色类
 */
public class ConcreteObserver implements Observer{
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "接收到：" + message);
    }
}
