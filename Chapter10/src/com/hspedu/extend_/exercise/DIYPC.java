package com.hspedu.extend_.exercise;

public class DIYPC extends Computer {

    //默认无参构造器，
    public DIYPC(){
        // 会默认调用父类的无参构造
        super("123",15,1042);
    }

    public DIYPC(String CPU, int memory, int harddisk) {
        super(CPU, memory, harddisk);
    }

    public void PrintInfo(){
        System.out.println(getDetails());
    }

}
