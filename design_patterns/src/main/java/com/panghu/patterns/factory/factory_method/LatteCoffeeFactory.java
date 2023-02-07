package com.panghu.patterns.factory.factory_method;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/18 18:40
 * @description LatteCoffee工厂
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
