package com.panghu.patterns.bridge;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/23 14:09
 * @description 具体的实现化角色
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件" + fileName);
    }
}
