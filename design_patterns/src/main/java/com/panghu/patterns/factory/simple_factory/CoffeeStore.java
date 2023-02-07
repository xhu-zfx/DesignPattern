package com.panghu.patterns.factory.simple_factory;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/17 20:29
 * @description
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.createCoffee("latte");
        coffee.addSuger();
        coffee.addMilk();
        return coffee;
    }
}
