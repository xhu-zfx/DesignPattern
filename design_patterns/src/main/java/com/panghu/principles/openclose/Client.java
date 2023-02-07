package com.panghu.principles.openclose;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/8 16:33
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 创建sougou对象
        SougouInPut inPut = new SougouInPut();
        // skin
        // DefaultSkin skin = new DefaultSkin();
        PanghuSkin skin = new PanghuSkin();
        // 将skin设置到sougou
        inPut.setSkin(skin);
        // 显示皮肤
        inPut.display();
    }
}
