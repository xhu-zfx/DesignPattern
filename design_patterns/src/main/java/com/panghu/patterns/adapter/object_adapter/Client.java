package com.panghu.patterns.adapter.object_adapter;


/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/20 20:34
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);
        // 创建适配器类对象
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String msg1 = computer.readSD(sdAdapterTF);
        System.out.println(msg1);
    }
}
