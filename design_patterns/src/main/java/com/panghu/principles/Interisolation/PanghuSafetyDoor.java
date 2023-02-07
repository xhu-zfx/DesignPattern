package com.panghu.principles.Interisolation;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/10 15:03
 * @description
 */
public class PanghuSafetyDoor implements SafetyDoor{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
