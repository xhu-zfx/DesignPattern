package com.panghu.patterns.singleton;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/17 12:29
 * @description 懒汉式：私有构造方法
 */
public class Lazy {
    // 私有构造方法
    private Lazy() {
    }
    // 声明Singleton类型的变量
    private static Lazy instance;
    // 对外提供访问方式
    public static synchronized Lazy getInstance(){
        // 判断instance是否为null
        if (instance == null) {
            // 如果还未被创建，则在此创建
            instance = new Lazy();
        }
        // 如果被创建，则直接返回
        return instance;
    }
}
