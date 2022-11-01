package com.zlh.test.day0705;
//构造器入门案例
public class Constructor {
    public static void main(String[] args) {
        Person p = new Person("Jason",23);
        System.out.println(p.name +"的休息如下:");
        System.out.println("姓名: " + p.name);
        System.out.println("年龄: " + p.age);
    }
}

class Person{

    //属性，也成为全局变量，作用范围是同一个类
    int age;
    String name;

    //构造器也称为构造方法，在创建对象时 用于初始化对象
    // 访问修饰符 没有返回类型 与类同名的方法

    public Person(String pName, int pAge){
        System.out.println("构造器被调用，完成对象的初始化...");
        age = pAge;
        name = pName;
    }

}
