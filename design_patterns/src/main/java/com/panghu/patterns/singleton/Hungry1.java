package com.panghu.patterns.singleton;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/12 14:07
 * @description 饿汉式：静态成员变量
 */
public class Hungry1 {

    // 1.私有构造方法
    private Hungry1() {
    }

    // 2.在本类中创建本类对象
    private static Hungry1 instance = new Hungry1();

    // 3.提供一个公共的访问方式，来获取该对象
    public static Hungry1 getInstance(){
        return instance;
    };
}
