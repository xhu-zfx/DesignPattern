package com.panghu.patterns.observer;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/9 16:32
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 创建公众号对象
        ConcreteSubject weChatOfficialAccount = new ConcreteSubject();
        // 创建微信用户
        ConcreteObserver weChatUser1 = new ConcreteObserver("雄安王");
        ConcreteObserver weChatUser2 = new ConcreteObserver("礼堂顶针");
        ConcreteObserver weChatUser3 = new ConcreteObserver("丽丽");
        // 订阅
        weChatOfficialAccount.attach(weChatUser1);
        weChatOfficialAccount.attach(weChatUser2);
        weChatOfficialAccount.attach(weChatUser3);
        // 公众号通知订阅者
        weChatOfficialAccount.notify("丁真疯了，说是要搞什么新礼堂");
    }
}
