package com.panghu.principles.dependinver.execute;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/8 18:10
 * @description
 */
public class ComputerDemo {
    public static void main(String[] args) {
        // 创建零件
        CPU cpu = new InterCPU();
        HardDisk hardDisk = new XiJieHardDisk();
        Memory memory = new KingstonMemory();
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);
        computer.run();
    }
}
