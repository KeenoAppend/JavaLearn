package com.hspedu.extend_.exercise;

public class PC extends Computer {

    private String brand;

    public PC(String CPU, int memory, int harddisk, String brand) {
        super(CPU, memory, harddisk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void PrintInfo(){
        System.out.println("-----------计算机硬件信息------------");
        System.out.println(getDetails() + ", brand =  " + brand);
    }
}
