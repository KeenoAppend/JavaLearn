package com.hspedu.codeblock_;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        new B02();
    }
}
class A02 {
    // 静态方法的初始化 和 类加载相关
    private static int n1 = getVal01();

    static {
        System.out.println("02: A02的一个静态代码块");
    }

    {
        System.out.println("05: A02的一个普通代码块");
    }


    public int n3 = getVal02();

    private static int getVal01() {
        System.out.println("01: getVal01()被调用");
        return 10;
    }

    private int getVal02() {
        System.out.println("06: getVal02()被调用");
        return 10;
    }

    public A02(){
        // 1 super()
        // 2 普通代码块
        System.out.println("07: A02的构造器..");
    }
}

class B02 extends A02 {

    private static int n3 = getVal03();

    static {
        System.out.println("04: B02的一个static代码块");
    }

    public int n5 = getVal04();
    {
        System.out.println("09: B02的一个普通代码块");
    }


    private static int getVal03() {
        System.out.println("03: getVal03()被调用");
        return 10;
    }

    private int getVal04() {
        System.out.println("08: getVal04()被调用");
        return 10;
    }

    public B02() {
        // 1. super()
        // 2. 普通代码块 he 普通属性初始化
        System.out.println("10: B02的构造器..");
    }
}

class C02{
    private int n1 = 100;
    private static int n2 = 200;

    private void m1(){

    }
    private static void m2(){

    }

    static {//静态代码块只能访问 静态成员
//        System.out.println(n1);
        System.out.println(n2);
//        m1();
        m2();
    }

    {//普通代码块 都可以访问
        System.out.println(n1);
        System.out.println(n2);
        m1();
        m2();
    }
}
