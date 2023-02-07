package com.panghu.patterns.decorator;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/22 12:29
 * @description
 */
public class Client {
    public static void main(String[] args) {
        FastFood friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + " " + friedRice.cost());

        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + " " + friedRice.cost());


    }
}
