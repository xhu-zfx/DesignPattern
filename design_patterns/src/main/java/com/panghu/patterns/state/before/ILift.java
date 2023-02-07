package com.panghu.patterns.state.before;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/8 15:36
 * @description
 */
public interface ILift {
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUINNING_STATE = 3;
    int STOPING_STATE = 4;
    void setState(int state);

    void open();
    void close();
    void run();
    void stop();
}
