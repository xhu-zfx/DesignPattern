package com.panghu.patterns.factory;/**
 * @author  xhu-zfx
 * @email  <756867768@qq.com>
 * @date  2022/12/17 20:35
 * @description
 */public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();

        Coffee coffee = coffeeStore.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
