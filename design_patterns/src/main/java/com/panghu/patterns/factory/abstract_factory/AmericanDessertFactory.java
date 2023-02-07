package com.panghu.patterns.factory.abstract_factory;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/18 19:12
 * @description
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
