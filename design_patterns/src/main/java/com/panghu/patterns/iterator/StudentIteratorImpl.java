package com.panghu.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/11 9:34
 * @description 具体迭代器类
 */
public class StudentIteratorImpl implements StudentIterator{
    private List<Student> studentList = new ArrayList<>();
    private int index = 0;

    public StudentIteratorImpl(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Student next() {
        return studentList.get(index++);
    }
}
