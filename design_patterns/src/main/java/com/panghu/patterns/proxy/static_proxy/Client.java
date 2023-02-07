package com.panghu.patterns.proxy.static_proxy;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/20 18:42
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 创建对象
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
