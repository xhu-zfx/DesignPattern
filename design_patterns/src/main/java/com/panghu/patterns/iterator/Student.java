package com.panghu.patterns.iterator;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/11 9:30
 * @description
 */
public class Student {
    private String name;
    private String number;

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
