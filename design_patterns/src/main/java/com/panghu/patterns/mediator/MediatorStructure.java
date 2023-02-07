package com.panghu.patterns.mediator;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/11 9:08
 * @description 中介类
 */
public class MediatorStructure extends Mediator {
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person person) {
        if (person == houseOwner){
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }
}
