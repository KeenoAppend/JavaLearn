//package com.hspedu.static_;
//
//public class StaticExercise02 {
//}
//
//class Person{
//    private int id;
//    private static int total=0;
//
//    //静态成员方法,是无法访问普通成员变量的
//    //无法从静态上下文中引用非静态 变量 id
//    public static int getToalPerson(){
////        id++;
//        return total;
//    }
//
//    //非静态成员方法，可以访问所有变量
//    public Person() {
//        total++;
//        id = total;
//    }
//}
//class TestPerson{
//    public static void main(String[] args) {
//        System.out.println("Number of total is " + Person.getToalPerson());
//        Person p1 = new Person();
//        System.out.println("Number of total is " + Person.getToalPerson());
//    }
//}