package com.panghu.patterns.state.before;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/8 15:48
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(ILift.OPENING_STATE);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
