package com.panghu.patterns.strategy;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/7 16:06
 * @description 具体策略类
 */
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满200元减50元");

    }
}
