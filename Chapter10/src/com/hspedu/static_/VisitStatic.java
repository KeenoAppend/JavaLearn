package com.hspedu.static_;

public class VisitStatic {
    public static void main(String[] args) {
        //说明类变量名 是随着类的加载而创建的,所以即使没有创建对象也可以访问
        System.out.println(A.name);

        A a = new A();
        System.out.println(a.name);
    }
}

class A{
    //推荐把修饰符写在最前面
    //类变量的访问，必须遵守访问权限
    public static String name = "ZLH";

    //普通属性，普通成员变量，非静态属性
    //java设计者推荐使用   类名.变量名
    private int num = 10;
}
