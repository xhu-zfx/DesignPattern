package com.panghu.patterns.state.after;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/9 15:40
 * @description 开启状态
 */
public class OpeningState extends LiftState{

    @Override
    public void open() {
        System.out.println("电梯开启");
    }

    @Override
    public void close() {
        // 修改状态
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void run() {
        // 无法操作
    }

    @Override
    public void stop() {
        // 无法操作
    }
}
