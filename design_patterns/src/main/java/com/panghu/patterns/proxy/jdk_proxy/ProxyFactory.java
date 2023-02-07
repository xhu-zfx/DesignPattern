package com.panghu.patterns.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/20 18:48
 * @description 获取代理对象的工厂类
 */
public class ProxyFactory {
    private TrainStation station = new TrainStation();

    // 获取代理对象的方法
    public SellTickets getProxyObject(){
        /*
          ClassLoader loader ：类加载器，用于加载代理类。可用通过目标对象获取类加载器
          Class<?>[] interfaces ：代理类实现的接口字节码对象
          InvocationHandler h ：代理对象的调用处理程序
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                (proxy,method,args) -> {
                    System.out.println("代理点jdk收取一些服务费用");
                    Object obj = method.invoke(station, args);
                    return obj;
                }
//                new InvocationHandler() {
//                    /*
//                        Object proxy ：代理对象，和proxyObject是同一个对象
//                        Method method ：对接口进行封装的方法
//                        Object[] args ：
//                     */
//                    @Override
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
////                        System.out.println("invoke执行了.......");
//                        System.out.println("代理点收取一些服务费用");
//                        Object obj = method.invoke(station, args);
//                        return obj;
//                    }
//                }
        );
        return proxyObject;
    }
}
