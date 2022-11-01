package com.zlh.test.day0705;
//构造器必须和类名相同
public class ConstructorDetail {
    public static void main(String[] args) {
        CDPerson p1 = new CDPerson("king", 40);
        CDPerson p2 = new CDPerson("tom");

        Dog d = new Dog();
    }
}

class Dog{
    //必须显示声明无参构造，才可以避免创建对象时报错
    public Dog(){

    }
    public Dog(String pName){

    }
}

class CDPerson{
    //全局变量有默认值
    String name;
    int age;

    public CDPerson(String pName, int pAge){
        //通过构造器给属性赋值
        name = pName;
        age = pAge;
    }
    //构造器重载
    public CDPerson(String pName){
        name = pName;
    }
}
