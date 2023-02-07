package com.panghu.principles.dependinver;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/8 17:50
 * @description
 */
public class ComputerDemo {
    public static void main(String[] args) {
        // 创建计算机零件
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        InterCPU cpu = new InterCPU();
        KingstonMemory memory = new KingstonMemory();
        // 创建计算机对象
        Computer computer = new Computer();
        // 组装计算机
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);
        computer.run();
        hardDisk.save("10010231312312381");
    }
}
