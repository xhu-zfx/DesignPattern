package com.panghu.patterns.state.after;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/9 15:38
 * @description
 */
public class Context {
    // 定义对应状态的常量
    public static final OpeningState OPENING_STATE = new OpeningState();
    public static final ClosingState CLOSING_STATE = new ClosingState();
    public static final RunningState RUNNING_STATE = new RunningState();
    public static final StopingState STOPING_STATE = new StopingState();
    // 定义记录当前状态的变量
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }
    public void open(){
        this.liftState.open();
    }
    public void close(){
        this.liftState.close();
    }
    public void run(){
        this.liftState.run();
    }
    public void stop(){
        this.liftState.stop();
    }
}
