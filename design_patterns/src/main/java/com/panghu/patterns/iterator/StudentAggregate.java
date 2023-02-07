package com.panghu.patterns.iterator;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/11 9:38
 * @description 抽象聚合接口
 */
public interface StudentAggregate {
    void addStudent(Student student);
    void delete(Student student);
    StudentIterator getStudentIterator();
}
