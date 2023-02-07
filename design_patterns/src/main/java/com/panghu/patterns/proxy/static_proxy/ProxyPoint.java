package com.panghu.patterns.proxy.static_proxy;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/20 18:39
 * @description 代售点
 */
public class ProxyPoint implements SellTickets{
    // 声明火车站类对象
    private TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("代理点收取一些服务费用");
        trainStation.sell();
    }
}
