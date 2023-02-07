package com.panghu.patterns.prototype;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/19 12:54
 * @description
 */
public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("具体的原型对象创建完成！");
    }
    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
