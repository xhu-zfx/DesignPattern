package com.panghu.patterns.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/20 19:31
 * @description
 */
public class ProxyFactory implements MethodInterceptor {
    TrainStation station = new TrainStation();
    public TrainStation getProxyObject(){
        // 创建Enhancer对象
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation trainStation = (TrainStation) enhancer.create();
        return trainStation;
    };

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib");
        Object obj = method.invoke(station, objects);
        return obj;
    }

}
