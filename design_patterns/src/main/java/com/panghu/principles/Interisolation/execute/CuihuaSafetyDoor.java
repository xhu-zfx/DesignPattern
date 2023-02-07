package com.panghu.principles.Interisolation.execute;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/10 15:13
 * @description
 */
public class CuihuaSafetyDoor implements AntiTheft,WaterProof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
