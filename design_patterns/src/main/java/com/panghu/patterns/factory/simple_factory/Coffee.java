package com.panghu.patterns.factory.simple_factory;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/17 20:23
 * @description
 */
public abstract class Coffee {
    public abstract String getName();
    public void addSuger(){
        System.out.println("add Suger");
    }

    public void addMilk(){
        System.out.println("add Milk");
    }

}
