package com.panghu.patterns.singleton.reflection;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/17 14:07
 * @description
 */
public class SingletonOver {

    //私有构造方法
    private SingletonOver() {
        /*
           反射破解单例模式需要添加的代码
        */
        if(instance != null) {
            throw new RuntimeException();
        }
    }

    private static volatile SingletonOver instance;

    //对外提供静态方法获取该对象
    public static SingletonOver getInstance() {

        if(instance != null) {
            return instance;
        }

        synchronized (SingletonOver.class) {
            if(instance != null) {
                return instance;
            }
            instance = new SingletonOver();
            return instance;
        }
    }
}