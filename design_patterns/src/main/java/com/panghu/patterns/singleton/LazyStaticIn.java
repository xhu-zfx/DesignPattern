package com.panghu.patterns.singleton;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/17 13:08
 * @description 懒汉式：静态内部类
 */
public class LazyStaticIn {
    private LazyStaticIn() {
    }
    // 定义一个静态内部类
    private static class LazyStaticInHolder{
        // 在内部类中声明并初始化外部类的对象
        private static final LazyStaticIn INSTANCE = new LazyStaticIn();
    }
    // 提供公共访问方法
    public static LazyStaticIn getInstance(){
        return LazyStaticInHolder.INSTANCE;
    }
}
