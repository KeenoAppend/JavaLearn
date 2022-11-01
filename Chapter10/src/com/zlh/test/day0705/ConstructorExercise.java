package com.zlh.test.day0705;

public class ConstructorExercise {
    public static void main(String[] args) {
        CEPerson p1 = new CEPerson();
        System.out.println("打印p1对象信息,姓名=" + p1.name + ";年龄= " + p1.age);

        CEPerson p2 = new CEPerson("zlhg",23);
        System.out.println("打印p2对象信息,姓名=" + p2.name + ";年龄= " + p2.age);
    }
}

class CEPerson{
    String name;
    int age;

    public CEPerson(){
        age = 18;
    }

    public CEPerson(String pName, int pAge){
        name = pName;
        age = pAge;
    }
}
