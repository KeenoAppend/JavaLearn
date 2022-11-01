package com.hspedu.extend_.exercise;

public class Computer {
    private String CPU;
    private int Memory;
    private int Harddisk;

    //Computer的构造器
    public Computer(String CPU, int memory, int harddisk) {
        this.CPU = CPU;
        this.Memory = memory;
        this.Harddisk = harddisk;
    }

    //返回电脑详细信息
    public String getDetails(){
        return "cpu = " + getCPU() + ", Mem = " + getMemory() + ",Harddisk = " + getHarddisk();
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public int getHarddisk() {
        return Harddisk;
    }

    public void setHarddisk(int harddisk) {
        Harddisk = harddisk;
    }
}
