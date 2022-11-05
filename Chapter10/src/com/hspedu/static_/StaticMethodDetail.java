package com.hspedu.static_;

public class StaticMethodDetail {
    public static void main(String[] args) {

//        Non-static method 'say()' cannot be referenced from a static context
//        D.say();


        D.hi();
    }
}

class D {

    private int n1 = 0;
    private static int n2 = 0;

    public void say() {
    }

    public static void hi() {
        hello();
//        System.out.println(n1); 静态方法无法访问 非静态成员
        System.out.println(n2);
    }

    public static void hello(){
//        say();        静态方法无法访问 普通成员方法
    }
}