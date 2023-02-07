package com.panghu.patterns.adapter.object_adapter;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/20 20:37
 * @description
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("SDAdapterTF READ ");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDAdapterTF WRITE ");
        tfCard.writeTF(msg);
    }
}
