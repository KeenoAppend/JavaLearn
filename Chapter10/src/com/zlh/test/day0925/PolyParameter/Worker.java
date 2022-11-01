package com.zlh.test.day0925.PolyParameter;

public class Worker extends Employee {


    public Worker(String name, double salary) {
        super(name, salary);
    }



    public void work(){
        System.out.println("工人 " + getName() + " 在working");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
