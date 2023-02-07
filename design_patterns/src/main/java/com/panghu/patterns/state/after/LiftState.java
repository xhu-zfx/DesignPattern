package com.panghu.patterns.state.after;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/9 15:37
 * @description 抽象状态类
 */
public abstract class LiftState {
    // 声明环境角色类变量
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();

}
