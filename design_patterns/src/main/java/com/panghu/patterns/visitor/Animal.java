package com.panghu.patterns.visitor;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/12 9:30
 * @description 抽象元素角色类
 */
public interface Animal {
    // 接收访问者访问
    void accept(Person person);
}
