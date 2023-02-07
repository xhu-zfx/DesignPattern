package com.panghu.principles.dependinver.execute;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/8 17:45
 * @description
 */
public class InterCPU implements CPU{
    public void run(){
        System.out.println("InterCPU正在运行");
    }
}
