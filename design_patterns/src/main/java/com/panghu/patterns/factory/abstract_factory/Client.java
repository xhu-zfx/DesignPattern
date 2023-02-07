package com.panghu.patterns.factory.abstract_factory;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/18 19:14
 * @description
 */
public class Client {
    public static void main(String[] args) {
//        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();
        AmericanDessertFactory americanDessertFactory = new AmericanDessertFactory();
        Coffee coffee = americanDessertFactory.createCoffee();
        Dessert dessert = americanDessertFactory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
