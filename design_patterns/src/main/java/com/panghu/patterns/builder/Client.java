package com.panghu.patterns.builder;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/19 13:48
 * @description
 */
public class Client {
    public static void main(String[] args) {
//        // 创建指挥者对象
//        Director director = new Director(new MobileBuilder());
//        Bike bike = director.construst();
//        System.out.println(bike.getFrame());
//        System.out.println(bike.getSeat());
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .mainboard("华硕")
                .memory("金士顿")
                .screen("三星")
                .build();
        System.out.println(phone);
    }
}
