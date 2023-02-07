package com.panghu.principles.demeter;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/10 20:00
 * @description
 */
public class Agent {
    Star star;
    Fans fans;
    Company company;

    public void meeting(){
        System.out.println("明星：" + star.getName() + "和粉丝：" + fans.getName() + "见面");
    }
    public void business(){
        System.out.println("明星：" + star.getName() + "和公司：" + company.getName() + "洽谈");
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
