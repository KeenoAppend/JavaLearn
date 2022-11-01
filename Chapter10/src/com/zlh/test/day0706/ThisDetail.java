package com.zlh.test.day0706;

public class ThisDetail {
    public static void main(String[] args) {
        T t = new T();
        t.f3();
//        t.f2();

    }
}

class T{
    String name = "jason";
    int age = 10;
    public T(){
        this("jack",100);
        System.out.println("T()构造器被调用");
    }
    public T(String name, int age){
        System.out.println("T(String name, int age)被调用");
    }

    public void f1(){
        System.out.println("方法一被调用....");
    }

    public void f2(){
        System.out.println("方法2被调用...");

        f1();
        this.f1();
    }

    public void f3(){
        String name = "Smith";
        System.out.println("name=" + name + ";age= "+ age);
        System.out.println("name=" + this.name + ";age= "+ this.age);

    }
}
