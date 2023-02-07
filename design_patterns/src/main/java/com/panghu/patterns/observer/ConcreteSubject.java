package com.panghu.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/9 16:27
 * @description 具体主题对象类
 */
public class ConcreteSubject implements Subject{

    private List<Observer> weChatUserList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weChatUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weChatUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        weChatUserList.forEach(observer -> {
            observer.update(message);
        });
    }
}
