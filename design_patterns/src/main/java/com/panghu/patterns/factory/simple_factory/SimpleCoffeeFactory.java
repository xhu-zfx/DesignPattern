package com.panghu.patterns.factory.simple_factory;



/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/17 20:49
 * @description
 */
public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            System.out.println("没有所需要的Coffee");
        }
        return coffee;
    }

}
