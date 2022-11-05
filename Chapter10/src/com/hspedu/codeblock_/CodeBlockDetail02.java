package com.hspedu.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}


class A{
    //普通成员属性初始化
    private int n2 = getN2();
    {
        //普通代码块
        System.out.println("A normal code block");
    }
    static{//静态代码块
        System.out.println("A 静态代码块01");
    }


    private int getN2() {
        System.out.println("getN2()被调用...");
        return 200;
    }

    //静态属性初始化
    private static int n1 = getN1();

//    static{//静态代码块
//        System.out.println("A 静态代码块01");
//    }

    public static int getN1(){
        System.out.println("getN1被调用....");
        return 100;
    }

    public A(){
        System.out.println("无参构造器A() 被掉i用...");
    }
}