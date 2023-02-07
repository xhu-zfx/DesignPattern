package com.panghu.patterns.adapter.class_adapter;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/20 20:28
 * @description 目标接口
 */
public interface SDCard {
    String readSD();
    void writeSD(String msg);
}
