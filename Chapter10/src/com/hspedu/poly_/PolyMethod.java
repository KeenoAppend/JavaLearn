package com.hspedu.poly_;

public class PolyMethod {
    public static void main(String[] args) {

        //方法重载的多态体现
        /*
            通过传入不同的参数，就会调用同一个方法sum的重载方法
         */
        A a = new A();
        a.sum(1,2);
        a.sum(11,22,33);


        /*
            方法的重写里，通过不同对象对同一个方法名的引用，
            回去调用不同的方法。
         */
        B b = new B();
        b.say();
        a.say();
    }
}

class B {
    public void say(){
        System.out.println("B say()方法你被调用....");
    }

}

class A extends B{
    public int sum(int n1,int n2){
        return n1 + n2;
    }

    public int sum(int n1,int n2,int n3){
        return n1+n2+n3;
    }

    public void say(){
        System.out.println("A say()方法你被调用....");
    }
}
