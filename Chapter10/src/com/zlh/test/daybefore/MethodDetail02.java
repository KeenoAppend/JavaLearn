package com.zlh.test.daybefore;

public class MethodDetail02 {
    public static void main(String[] args) {

        A a = new A();
//        a.hi();
        a.say2B();
    }
}

class A{
    //同类中的方法，通过方法名可以直接调用
    public void hi(){
        System.out.println("A类中的hi()被调用");
        print();
    }

    public void print(){
        System.out.println("A类中print()方法被调用");
    }

    public void say2B(){
        System.out.println("A类中say2b方法被执行");

        //不同类中的方法需要创建对象 来调用

        B b = new B();
        b.BsayHello();
        System.out.println("say2b方法继续执行");
    }

}

class B{

    public void BsayHello(){
        System.out.println("B类中的方法被调用");
    }

}
