package com.panghu.patterns.bridge;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/23 14:16
 * @description
 */
public class Client {
    public static void main(String[] args) {
        OS system = new Mac(new AviFile());
        system.play("吴京!!!");
    }
}
