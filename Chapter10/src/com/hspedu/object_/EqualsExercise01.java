package com.hspedu.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
//        Person person1 = new Person("jack", 10, '男');
//        Person person2 = new Person("jack", 10, '男');
        //没有重写 默认继承Object的 equals方法
        //但是我的要求 是 两个对象  属性相同，就认为是相同
//        System.out.println(person1.equals(person2));

    }
}

//class Person{
//    private String name;
//    private int age;
//    private char gender;
//
//    //需要重写Object的equals方法
//    public boolean equals(Object obj) {
//        //判断两个对象是同一个对象，直接返回true
//        /*
//            this == obj
//            person1.equals(person2)
//
//            this指代调用的对象---person1
//            obj指代传入的对象 ---person2
//         */
//        if ( this == obj ){
//            return true;
//        }
//        //类型判断
//        if (obj instanceof Person){ //判断传入的参数是否为Person类
//            /*
//                向下转型
//                因为，我需要取得obj里面的属性
//             */
//            Person p = (Person) obj;
//            //这里的equals调用的是 String中的方法
//            return this.name.equals(p.name) &&
//                    this.age == p.age &&
//                    this.gender == p.gender;
//
//        }
//        return false;
//    }
//
//    public Person(String name, int age, char gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public char getGender() {
//        return gender;
//    }
//
//    public void setGender(char gender) {
//        this.gender = gender;
//    }
//}
