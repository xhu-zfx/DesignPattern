package com.panghu.patterns.strategy;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/7 16:10
 * @description
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
        salesMan.setStrategy(new StrategyB());
        salesMan.salesManShow();
        salesMan.setStrategy(new StrategyC());
        salesMan.salesManShow();
    }
}
