package com.panghu.patterns.factory.abstract_factory;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/18 19:13
 * @description
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
