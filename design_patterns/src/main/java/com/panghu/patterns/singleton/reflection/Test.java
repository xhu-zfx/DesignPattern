package com.panghu.patterns.singleton.reflection;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {
        //获取Singleton类的字节码对象
        Class clazz = SingletonOver.class;
        //获取Singleton类的私有无参构造方法对象
        Constructor constructor = clazz.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);

        //创建Singleton类的对象s1
        SingletonOver s1 = (SingletonOver) constructor.newInstance();
        //创建Singleton类的对象s2
        SingletonOver s2 = (SingletonOver) constructor.newInstance();

        //判断通过反射创建的两个Singleton对象是否是同一个对象
        System.out.println(s1 == s2);
    }
}