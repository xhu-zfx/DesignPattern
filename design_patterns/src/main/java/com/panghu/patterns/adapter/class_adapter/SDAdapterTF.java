package com.panghu.patterns.adapter.class_adapter;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/20 20:37
 * @description
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{

    @Override
    public String readSD() {
        System.out.println("SDAdapterTF READ ");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDAdapterTF WRITE ");
        writeTF(msg);
    }
}
