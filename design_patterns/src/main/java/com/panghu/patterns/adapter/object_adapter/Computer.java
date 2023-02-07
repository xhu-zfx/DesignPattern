package com.panghu.patterns.adapter.object_adapter;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/20 20:31
 * @description
 */
public class Computer {
    String readSD(SDCard sdCard) {
        if (sdCard == null) throw new RuntimeException("SDCard is not null");
        return sdCard.readSD();
    }
}
