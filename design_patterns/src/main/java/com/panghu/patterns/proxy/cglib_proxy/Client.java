package com.panghu.patterns.proxy.cglib_proxy;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/20 19:40
 * @description
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
