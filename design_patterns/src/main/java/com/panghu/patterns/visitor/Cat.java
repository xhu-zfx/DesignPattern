package com.panghu.patterns.visitor;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/12 9:31
 * @description
 */
public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
    }
}
