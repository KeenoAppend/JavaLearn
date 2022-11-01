package com.hspedu.modifier;

public class A {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    //同一个类下，均可访问
    public void test(){
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
    }
}
