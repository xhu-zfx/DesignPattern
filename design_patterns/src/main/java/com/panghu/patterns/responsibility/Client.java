package com.panghu.patterns.responsibility;


/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/8 15:11
 * @description
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("老王",1,"不搞了");

        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        groupLeader.submit(leaveRequest);
    }
}
