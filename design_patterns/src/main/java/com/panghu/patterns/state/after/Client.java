package com.panghu.patterns.state.after;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/9 15:53
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 创建环境对象角色
        Context context = new Context();
        // 设置当前电梯状态
        context.setLiftState(new ClosingState());
        context.open();
        context.run();
        context.close();
        context.stop();
    }
}
