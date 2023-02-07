package com.panghu.patterns.bridge;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/23 14:15
 * @description 拓展抽象化角色
 */
public class Mac extends OS{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
