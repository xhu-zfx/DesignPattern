package com.panghu.principles.dependinver.execute;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/8 17:42
 * @description
 */
public class XiJieHardDisk implements HardDisk{
    public void save(String data){
        System.out.println("使用希捷硬盘存储的数据为" + data);
    }
    public String getData(){
        return "使用希捷硬盘存储读取数据";
    }
}
