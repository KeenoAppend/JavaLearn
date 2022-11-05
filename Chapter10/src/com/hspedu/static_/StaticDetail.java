package com.hspedu.static_;

public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
        int age = b.age;
        System.out.println(B.age);
    }
}

class B{
    public int age2 = 10;
    public static int age = 10;
}
