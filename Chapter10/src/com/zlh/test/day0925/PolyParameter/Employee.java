package com.zlh.test.day0925.PolyParameter;

public class Employee {
    private String name;
    private double salary; //月工资

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //计算年薪的方法
    public double getAnnual(){
        return 12 * salary;
    }
}
