package com.panghu.patterns.visitor;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/12 9:31
 * @description
 */
public class Owner implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("喵喵喵");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("汪汪汪");
    }
}
