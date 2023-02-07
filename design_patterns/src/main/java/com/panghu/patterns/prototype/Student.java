package com.panghu.patterns.prototype;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/19 13:09
 * @description
 */
public class Student {
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
