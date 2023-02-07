package com.panghu.patterns.iterator;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/11 9:42
 * @description
 */
public class Client {
    public static void main(String[] args) {
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("顶针", "01"));
        studentAggregate.addStudent(new Student("王八", "02"));
        studentAggregate.addStudent(new Student("战狼", "03"));
        studentAggregate.addStudent(new Student("冷锋", "04"));
        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }
    }
}
