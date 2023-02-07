package com.panghu.patterns.visitor;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/12 9:29
 * @description 抽象访问者角色类
 */
public interface Person {
    void feed(Cat cat);
    void feed(Dog dog);
}
