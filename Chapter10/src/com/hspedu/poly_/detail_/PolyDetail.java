package com.hspedu.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型,父类的引用指向子类的对象
        //语法： 父类类型 父类引用 = new 子类类型();
        // 特点是: 编译类型在左边，运行类型在右边
        Animal animal = new Cat();
        Object obj = new Cat(); //可以吗?可以,因为object是cat的超类

        //可以调用父类的所有成员(需要有访问权限)
        //但是不能调用子类的成员
        /*
            在编译阶段，能调用那些成员，是由编译类型来决定的.
         */
//        animal.eat(); // true
//        animal.catMouse();

        //******最终的运行效果,要看子类的具体实现.******
        /*
            编译时，有编译器运行----javac
         */
        animal.eat(); //即调用方法运行时，按照从子类开始查找方法,然后调用
        animal.run();
        animal.sleep();
        animal.show();

        //多态的向下转型，
        // 我想要调用 猫的抓方法
//        编译器发现编译类型是 Animal,所以无法去调用 Cat里面的方法
//        animal.catchMouse();

        //看左边编译类型是 Cat
        //右边是运行类型，已经是 Cat了
        // 运行时,从运行类型开始找
        /*
            向下转型有特别要求
            要求父类引用必须指向的是当前目标类型的对象
         */

        Cat cat = (Cat) animal; //将父类的引用，强制转换为
        cat.catchMouse();   //执行时 从运行类型开始查找

        //java.lang.ClassCastException
        //com.hspedu.poly_.detail_.Cat cannot be cast to com.hspedu.poly_.detail_.Dog
        //类型转换异常
        Dog dog = (Dog) animal;

    }
}
