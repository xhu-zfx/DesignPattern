package com.panghu.patterns.command;

import java.util.Map;
import java.util.Set;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/8 10:31
 * @description 具体命令类
 */
public class OrderCommand implements Command{
    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void excute() {
        System.out.println(order.getDiningTable() + "桌的餐品：");
        Map<String, Integer> foodDir = order.getFoodDir();
        Set<String> keySet = foodDir.keySet();
        for (String foodName : keySet) {
            receiver.makeFood(foodName, foodDir.get(foodName));
        }
    }
}
