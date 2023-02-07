package com.panghu.patterns.singleton;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/17 12:50
 * @description 懒汉式：双重检查
 */
public class LazyDoubleCheck {
    // 私有构造方法
    public LazyDoubleCheck(){};
    // 声明该类型的变量
    private static volatile LazyDoubleCheck instance;
    // 对外提供公共访问方法
    public static LazyDoubleCheck getInstance(){
        // 第一次判断，如果instance的值不为null，不需要抢占锁，直接返回对象
        if (instance == null){
            synchronized (LazyDoubleCheck.class){
                // 第二次判断
                if (instance == null){
                    instance = new LazyDoubleCheck();
                }
            }
        }
        return instance;
    }
}
