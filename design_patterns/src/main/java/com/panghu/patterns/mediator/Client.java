package com.panghu.patterns.mediator;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/11 9:12
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 创建中介者对象
        MediatorStructure mediatorStructure = new MediatorStructure();
        Tenant tenant = new Tenant("顶针",mediatorStructure);
        HouseOwner houseOwner = new HouseOwner("丽丽", mediatorStructure);
        mediatorStructure.setHouseOwner(houseOwner);
        mediatorStructure.setTenant(tenant);
        tenant.constact("嘻嘻嘻");
        houseOwner.constact("哈哈哈");
    }
}
