package com.hspedu.static_;

public class StaticExercise03 {
}

class Person{
    private int id;
    private static int total=0;

    //静态方法中不允许使用 this关键字!!
    public static void setTotalPerson(int total){
        //a: 无法从静态上下文中引用非静态 变量 this
//        this.id = total;
        Person.total = total;

    }

    //构造器
    public Person(){
        total++;
        id = total;
    }

    // write one static method output value of total
    public static void m(){
        System.out.println("total="+Person.total);
    }
}

class TestPerson{
    public static void main(String[] args) {

        Person.setTotalPerson(3);
        new Person();
        Person.m();

    }
}
