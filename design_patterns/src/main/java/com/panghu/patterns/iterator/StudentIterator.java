package com.panghu.patterns.iterator;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/11 9:33
 * @description 抽象迭代器接口
 */
public interface StudentIterator {
    boolean hasNext();
    Student next();
}

