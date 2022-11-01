package com.zlh.test.day0925.PolyParameter;

public class Manager extends Employee {
    private double bouns;

    public Manager(String name, double salary, double bouns) {
        super(name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public void manage(){
        System.out.println("项目经理 " + getName() + " is managing project....");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bouns;
    }
}
