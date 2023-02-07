package com.panghu.patterns.factory.factory_method;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/18 18:44
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 创建CoffeeStore 对象
        CoffeeStore coffeeStore = new CoffeeStore();
        // 创建工厂对象
        CoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();
        coffeeStore.setFactory(americanCoffeeFactory);
        // 执行
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
