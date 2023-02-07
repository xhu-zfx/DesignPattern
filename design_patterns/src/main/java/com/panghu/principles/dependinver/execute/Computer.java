package com.panghu.principles.dependinver.execute;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/8 18:08
 * @description
 */
public class Computer {
    private HardDisk hardDisk;
    private CPU cpu;
    private Memory memory;

    public void run(){
        System.out.println(hardDisk.getData());
        cpu.run();
        memory.run();
        System.out.println("运行计算机成功");

    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}
