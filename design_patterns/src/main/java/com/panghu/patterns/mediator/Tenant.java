package com.panghu.patterns.mediator;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/11 9:04
 * @description
 */
public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }
    public void constact(String message){
        mediator.constact(message,this);
    }
    public void getMessage(String message){
        System.out.println("租房者" + name + "获取到的信息是" + message);
    }
}
