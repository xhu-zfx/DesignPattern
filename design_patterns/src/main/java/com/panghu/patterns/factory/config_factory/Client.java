package com.panghu.patterns.factory.config_factory;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/18 19:43
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());
    }
}
