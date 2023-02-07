package com.panghu.patterns.responsibility;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/8 11:26
 * @description
 */
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;
    // 该领导处理的请假时间区间
    private int numStart;
    private int numEnd;
    // 声明后继者
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }
    // 设置上级领导
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    // 设计各级领导处理请假条的方法
    protected abstract void handleLeave(LeaveRequest leaveRequest);
    // 提交请假条
    public final void submit(LeaveRequest leaveRequest){
        this.handleLeave(leaveRequest);
        if (this.nextHandler != null && leaveRequest.getNum() > this.numEnd){
            // 提交给上级领导
            this.nextHandler.submit(leaveRequest);
        } else {
            System.out.println("流程结束");
        }
    }
}
