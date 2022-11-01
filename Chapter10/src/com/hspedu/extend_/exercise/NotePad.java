package com.hspedu.extend_.exercise;
//如果父类没有无参构造，也就是有参构造将其覆盖
// 子类需要初始化父类的属性
public class NotePad extends Computer {

    private String color;

    public NotePad(String CPU, int memory, int harddisk, String color) {
        super(CPU, memory, harddisk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void PrintInfo(){
        System.out.println("------------设备信息-----------");
        System.out.println(getDetails() + ", color = " + color);
    }

    //    public NotePad(String name,int Memory,int Harddisk){
//        super(name,Memory,Harddisk);
//    }
}
