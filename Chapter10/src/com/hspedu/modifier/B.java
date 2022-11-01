package com.hspedu.modifier;

public class B {
    public void say(){
        //在同一个包下可以访问 public default protected
        //不能访问 private
        A a = new A();
//        System.out.println(a.n1 + " " + a.n2 + " " + a.n3 + " " + a.n4);
        System.out.println(a.n1 + " " + a.n2 + " " + a.n3 );

    }
}
