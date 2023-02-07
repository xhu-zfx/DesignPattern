package com.panghu.patterns.factory.factory_method;


/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/17 20:29
 * @description
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory coffeeFactory){
        this.factory = coffeeFactory;
    }
    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }
}
