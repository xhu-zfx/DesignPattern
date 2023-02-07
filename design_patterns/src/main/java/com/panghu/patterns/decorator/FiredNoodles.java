package com.panghu.patterns.decorator;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/21 19:46
 * @description
 */
public class FiredNoodles extends FastFood{
    public FiredNoodles() {
        super(12,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }

}
