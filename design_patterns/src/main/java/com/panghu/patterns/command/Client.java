package com.panghu.patterns.command;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/8 10:42
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 创建订单对象
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFoodDir("惺惺惜惺惺",2);
        order1.setFoodDir("cocal",1);
        Order order2 = new Order();
        order2.setDiningTable(1);
        order2.setFoodDir("会酷酷酷",2);
        order2.setFoodDir("persa",1);
        SeniorChef receiver = new SeniorChef();
        OrderCommand orderCommand1 = new OrderCommand(receiver,order1);
        OrderCommand orderCommand2 = new OrderCommand(receiver,order2);
        Waitor waitor = new Waitor();
        waitor.setCommands(orderCommand1);
        waitor.setCommands(orderCommand2);
        waitor.orderUp();
    }
}
