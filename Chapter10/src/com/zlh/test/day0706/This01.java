package com.zlh.test.day0706;

public class This01 {
    public static void main(String[] args) {
       Dog d = new Dog("大壮",5);
       System.out.println("dog1的hashcode=" + d.hashCode());
       d.info();

        System.out.println("==============");
        Dog d2 = new Dog("大壮",5);
        System.out.println("dog2的hashcode=" + d2.hashCode());
        d2.info();
    }
}

class Dog{
    String name;
    int age;
    //构造器
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("this的hashcode值=" + this.hashCode());
    }
    /*
    public Dog(String dName,int dAge){
        name = dName;
        age = dAge;
    }
     */
    //成员方法
    public void info(){
        System.out.println("this.hashCode=" + this.hashCode());
        System.out.println(name + "\t" + age );
    }
}
