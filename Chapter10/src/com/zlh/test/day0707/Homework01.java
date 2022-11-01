package com.zlh.test.day0707;

public class Homework01 {
    public static void main(String[] args) {
        A01 a01 = new A01();
        System.out.println(a01.max(10.5, 20.6));
    }
}

class A01{
    public double max(double a, double b){
        return a > b ? a : b;
    }
}
