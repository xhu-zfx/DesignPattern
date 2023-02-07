package com.panghu.principles.dependinver;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/8 17:47
 * @description
 */
public class Computer {
    private XiJieHardDisk hardDisk;
    private InterCPU cpu;
    private KingstonMemory memory;

    public void run(){
        System.out.println(hardDisk.getData());
        cpu.run();
        memory.run();
        System.out.println("运行计算机成功");
    }

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public InterCPU getCpu() {
        return cpu;
    }

    public void setCpu(InterCPU cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }
}
