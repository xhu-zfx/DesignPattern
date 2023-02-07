package com.panghu.patterns.facade;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/23 15:15
 * @description
 */
public class Client {
    public static void main(String[] args) {
        SmartApplicationsFacade facade = new SmartApplicationsFacade();
        facade.say("关闭所有");
        facade.say("打开所有");
    }
}
