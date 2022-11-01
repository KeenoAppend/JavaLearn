package com.hspedu.object_;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "hspedu";

        Person p2 = new Person();
        p2.name = "hspedu";

        System.out.println(p1 == p2);       //false
        System.out.println(p1.name.equals(p2.name));  //true
        System.out.println(p1.equals(p2)); // false

        String s1 = new String("asdf");
        String s2 = new String("asdf");


        //字符串在内存中的储存方式
        // true
        // false
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
    }
}
class Person{
    public String name;
}
