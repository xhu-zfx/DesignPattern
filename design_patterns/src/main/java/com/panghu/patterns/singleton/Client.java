package com.panghu.patterns.singleton;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/12 14:12
 * @description
 */
public class Client {
    public static void main(String[] args) {
//        Hungry1 instance = Hungry1.getInstance();
//        Hungry1 instance1 = Hungry1.getInstance();
//        // 判断获取到的两个对象是否是同一个

//        Hungry2 instance = Hungry2.getInstance();
//        Hungry2 instance1 = Hungry2.getInstance();

//        Lazy instance = Lazy.getInstance();
//        Lazy instance1 = Lazy.getInstance();
//
//        LazyDoubleCheck instance = LazyDoubleCheck.getInstance();
//        LazyDoubleCheck instance1 = LazyDoubleCheck.getInstance();

        LazyStaticIn instance = LazyStaticIn.getInstance();
        LazyStaticIn instance1 = LazyStaticIn.getInstance();

        System.out.println(instance1 == instance);

    }
}
