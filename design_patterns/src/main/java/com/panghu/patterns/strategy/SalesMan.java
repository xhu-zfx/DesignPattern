package com.panghu.patterns.strategy;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/7 16:08
 * @description 环境类
 */
public class SalesMan {
    private Strategy strategy ;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //向客户展示促销活动
    public void salesManShow(){
        strategy.show();
    }
}
