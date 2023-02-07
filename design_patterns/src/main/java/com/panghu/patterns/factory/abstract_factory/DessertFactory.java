package com.panghu.patterns.factory.abstract_factory;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/18 19:10
 * @description
 */
public interface DessertFactory {
    Coffee createCoffee();
    Dessert createDessert();
}
