package com.panghu.patterns.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/8 10:26
 * @description
 */
public class Order {
    // 餐桌号码
    private int diningTable;
    // 所属的餐品及个数
    private Map<String,Integer> foodDir = new HashMap<String,Integer>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFoodDir(String name,int num) {
        foodDir.put(name,num);
    }
}
