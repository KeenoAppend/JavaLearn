package com.hspedu.override_;

public class Dog extends Animal {
    public void cry(){
        System.out.println("小狗在叫....");
    }

    public String m1(){
        return null;
    }

    //子类不能缩小父类方法的访问权限
    public void eat(){

    }

    /*
        'm1()' in 'com.hspedu.override_.Dog' clashes with 'm1()'
        in 'com.hspedu.override_.Animal';
        attempting to use incompatible return type

    public Object m1(){
        return null;
    }

    */

//    public String m3(){
//        return null;
//    }
}

class AAA{

}

class BBB extends AAA{

}