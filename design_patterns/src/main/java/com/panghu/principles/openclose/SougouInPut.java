package com.panghu.principles.openclose;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/8 16:31
 * @description
 */
public class SougouInPut {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display(){
        skin.display();
    }
}
