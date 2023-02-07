package com.panghu.patterns.singleton;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/12 14:07
 * @description 饿汉式：静态代码块
 */
public class Hungry2 {

    // 1.私有构造方法
    private Hungry2() {
    }

    // 2.在本类中创建本类对象
    private static Hungry2 instance;

    // 3.在静态代码块中进行赋值
    static {
        instance = new Hungry2();
    }

    // 4.对外提供获取该类的方法
    public static Hungry2 getInstance() {
        return instance;
    }
}