package com.panghu.patterns.factory.factory_method;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/18 18:39
 * @description AmericanCoffee 工厂
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
