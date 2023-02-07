package com.panghu.patterns.adapter.class_adapter;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/20 20:26
 * @description
 */
public class TFCardImpl implements TFCard{
    public String readTF(){
        String msg = "TFCard READ MSG";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard WRITE MSG" + msg);
    }
}
