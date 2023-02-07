package com.panghu.patterns.prototype;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/19 13:02
 * @description
 */
public class Citation implements Cloneable{
//    String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
    public void show() {
        System.out.println(student.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }
}
