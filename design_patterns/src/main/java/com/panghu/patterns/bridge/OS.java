package com.panghu.patterns.bridge;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/23 14:11
 * @description 抽象化角色
 */
public abstract class OS {
    protected VideoFile videoFile;

    public OS(VideoFile videoFile) {
        this.videoFile = videoFile;
    }
    public abstract void play(String fileName);
}
