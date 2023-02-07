package com.panghu.patterns.state.before;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/8 15:40
 * @description
 */
public class Lift implements ILift{
    private int state;
    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state){
            case OPENING_STATE:break;
            case CLOSING_STATE:
                System.out.println("电梯打开了");
                setState(OPENING_STATE);
                break;
            case RUINNING_STATE:break;
            case STOPING_STATE:break;
        }
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
