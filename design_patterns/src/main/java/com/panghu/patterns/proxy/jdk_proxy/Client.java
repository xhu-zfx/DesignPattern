package com.panghu.patterns.proxy.jdk_proxy;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/20 18:57
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 获取代理对象
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
