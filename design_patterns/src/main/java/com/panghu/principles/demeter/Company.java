package com.panghu.principles.demeter;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/10 19:59
 * @description
 */
public class Company {
    String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
