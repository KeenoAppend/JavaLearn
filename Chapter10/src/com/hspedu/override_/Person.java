package com.hspedu.override_;

public class Person {

    private int age;
    private String name;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String Say(){
        return "name= " + name + ",age= " + age;
    }
}
