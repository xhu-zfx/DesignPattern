package com.panghu.patterns.observer;


/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/9 16:23
 * @description 抽象主题角色类
 */
public interface Subject {
    // 添加订阅者
    void attach(Observer observer);
    // 删除订阅者
    void detach(Observer observer);
    // 状态变化，通知订阅者
    void notify(String message);
}
