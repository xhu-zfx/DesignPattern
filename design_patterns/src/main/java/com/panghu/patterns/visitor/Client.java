package com.panghu.patterns.visitor;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/12 9:41
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());
        Owner owner = new Owner();
        home.action(owner);
    }
}
