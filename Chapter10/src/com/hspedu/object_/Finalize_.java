package com.hspedu.object_;

//演示Finalize的使用
public class Finalize_ {
    public static void main(String[] args) {

        Car bmw = new Car("宝马");    // 引用bmw 指向 Car对象
        bmw = null;

        System.gc(); //主动调用垃圾回收器
        /*
         引用bmw 被断开  Car对象,变成了垃圾对象,会被jvm回收
        在销毁对象前,会调用 其finalize()方法
        那么开发者就可以在 该方法中写入自己的业务逻辑
        比如释放资源 --- 连接数据库 / 打开文件 ...
        如果开发者不重写，就默认调用 Object的 finalize方法


            当对象被回收:
                当某个对象
         */

        System.out.println("this process has been closed..");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    //重写 finalize() 方法

    @Override
    protected void finalize() throws Throwable {
        //默认情况下,调用的父类 finalize方法
//        super.finalize();
        System.out.println("我们销毁汽车对象 = "+ name + ",并释放了内存");
    }
}
