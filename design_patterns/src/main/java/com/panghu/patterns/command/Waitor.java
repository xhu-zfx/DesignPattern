package com.panghu.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/8 10:38
 * @description
 */
public class Waitor {
    private List<Command> commands = new ArrayList<>();

    public void setCommands(Command cmd) {
        commands.add(cmd);
    }
    // 发起命令
    public void orderUp(){
        System.out.println("订单来了");
        for (Command command : commands) {
            if (command != null) command.excute();
        }
    }
}
