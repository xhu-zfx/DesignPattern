package com.panghu.patterns.adapter.class_adapter;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/20 20:29
 * @description
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "SDCard READ MSG";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard WRITE MSG" + msg);

    }
}
