package com.hspedu.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person(10,"Jackl");
        System.out.println(person.Say());

        Student student = new Student(10,"zlh",100,50.6);
        System.out.println(student.Say());
    }
}
