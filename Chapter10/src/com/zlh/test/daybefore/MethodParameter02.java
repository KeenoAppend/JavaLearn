package com.zlh.test.daybefore;

public class MethodParameter02 {
    public static void main(String[] args) {

        MP02 mp02 = new MP02();
        int[] arr = {1,2,3};

        Person00 p = new Person00();
        p.age = 10;
        p.name = "JAVK";

        p.test200(p);
        System.out.println("p.age = " + p.age);

//        System.out.print("传递参数前的main数组:");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ",");
//        }
//        System.out.println();
//        mp02.test100(arr);
//
//        System.out.print("传递参数后的main数组:");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }


    }
}

class Person00{

    String name;
    int age;

    public void test200(Person00 p){
        p = new Person00();
        p.age = 100;
        p.name  = "jack";
    }

}

class MP02{

    public void test100(int[] arr){

        arr[0] = 100;

        System.out.print("test100的arr数组:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

}
