package com.zlh.test.day0706;

/**
 * 定义一个Person类，nameage属性，提供compareto比较方法用于判断
 * 是否和另一个人相等，提供测试类 TestPerson
 * 名字和年龄完全一样 true
 */
public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("jason",20);
        Person p2 = new Person("jason",20);

//        Person p2 = new Person("smith",30);
        System.out.println("比较结果为: "+p1.compareTo(p2));
    }
}

class Person{
    String name;
    int age;

    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(Person p){
//        if ( this.name.equals(p.name) && this.age == p.age ){
//            return true;
//        }else {
//            return false;
//        }
        return this.name.equals(p.name) && this.age == p.age;

    }
}
