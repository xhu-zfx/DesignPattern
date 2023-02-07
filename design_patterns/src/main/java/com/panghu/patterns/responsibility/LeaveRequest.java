package com.panghu.patterns.responsibility;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/8 11:25
 * @description
 */
public class LeaveRequest {
    // 姓名
    private String name;
    // 天数
    private int num;
    // 原因
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
