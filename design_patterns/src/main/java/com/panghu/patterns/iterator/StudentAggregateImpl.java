package com.panghu.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/11 9:40
 * @description
 */
public class StudentAggregateImpl implements StudentAggregate{
    private List<Student> list = new ArrayList<>();
    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void delete(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
