package com.panghu.patterns.responsibility;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/8 15:02
 * @description
 */
public class GeneralManager extends Handler{
    public GeneralManager() {
        super(Handler.NUM_THREE,Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天，原因" + leaveRequest.getContent());
        System.out.println("GeneralManager审批完成");
    }
}
