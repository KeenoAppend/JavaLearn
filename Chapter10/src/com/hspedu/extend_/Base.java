package com.hspedu.extend_;

public class Base extends TopBase { //父类
    //四个不同修饰权限的属性
    public int n1 = 100;
    int n2 = 200;
    protected int n3 = 300;
    private int n4 = 400;

    public Base(){
        System.out.println("父类无参数构造器被调用Base()......");
    }

    public Base(String name,int age){
        System.out.println("父类构造方法Base(String nname,int age)被调用");
    }

    public Base(String name){
        System.out.println("父类中的Base(String name)构造器被调用......");
    }

    public void test100(){
        System.out.println("test100().....");
    }

    protected void test200(){
        System.out.println("test200().....");
    }

    void test300(){
        System.out.println("test300().....");
    }
    private void test400(){
        System.out.println("test400().....");
    }

    //提供一个公共的方法返回 n4
    public int getN4(){
        return n4;
    }

    public void calltest400(){
        test400();
    }

}
