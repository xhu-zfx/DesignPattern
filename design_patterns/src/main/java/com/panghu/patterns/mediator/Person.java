package com.panghu.patterns.mediator;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/11 9:01
 * @description
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;
    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
