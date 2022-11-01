package com.hspedu.super_;

public class B extends A {

    public int n1 = 889;


    public void test(){
        System.out.println(super.n1);
        super.cal();
    }

    // 访问父类的属性
    public void hi(){
//        super.n4;
//        'n4' has private access in 'com.hspedu.super_.A'


//        System.out.println( n1 + n2 + n3 + n4);
          System.out.println( n1 + n2 + n3);

    }

    public void OK(){
        super.test100();//访问父类的方法
        super.test200();
        super.test300();
//        super.test400();
    }


    public void cal(){
        System.out.println("B类的 cal()方法");
    }

    //访问父类的构造器

    public B(){
//        super();
    }

    public void sum(){
        System.out.println("B类中的 sum方法...");

        /*
        希望调用父类A中的 cal()方法
         因为子类B中 没有cal() 方法  这时有三种方法可以调用
        1.先找本类，看有无该方法调用
        2. 如果本类没有, 就去寻找父类,
        3.如果父类有，并可以调用，则调用
        4.如果父类没有，则继续向上 父类的父类查找
        5, 直到Object类,

        如果找到了，但是无法访问，则报错
        如果找不到，就提示方法不存在
         */

//        cal();

//        this.cal();//等价于 cal();

        super.cal(); //没有查找本类，直接查找父类


        //演示 访问属性的规则
        System.out.println(n1);
        System.out.println(this.n1);

        System.out.println(super.n1);


    }



}
