package com.panghu.principles.demeter;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/10 20:03
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 创建经纪人类
        Agent agent = new Agent();
        // 创建明星类
        Star star = new Star("伊藤舞雪");
        agent.setStar(star);
        // 创建粉丝类
        Fans fans = new Fans("李四");
        agent.setFans(fans);
        // 创建公司类
        Company company = new Company("麦当娜");
        agent.setCompany(company);

        agent.meeting();
        agent.business();
    }
}
