package com.panghu.patterns.proxy.static_proxy;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/20 18:38
 * @description 火车站
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
