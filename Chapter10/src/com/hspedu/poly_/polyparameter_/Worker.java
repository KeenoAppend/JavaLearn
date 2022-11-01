package com.hspedu.poly_.polyparameter_;

public class Worker extends Employee {

    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("工人 " + getName() + " is working ....");
    }

    //因为普通工人没有其他收入，
    //则直接调用父类方法即可
    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
