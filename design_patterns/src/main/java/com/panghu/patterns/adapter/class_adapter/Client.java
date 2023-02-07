package com.panghu.patterns.adapter.class_adapter;



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


        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);
    }
}
