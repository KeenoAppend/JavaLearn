package com.zlh.test.daybefore;

public class Method01 {
    public static void main(String[] args){
        // 方法使用
        // 1.方法写好好，需要调用
        Person p1 = new Person();
        p1.speak();
        p1.cal01();
        p1.cal02(100);

//        p1.getSUM(10,20);
        //吧getSum方法的返回值 赋值给 变量ret
        int returnRes = p1.getSum(10,20);
        System.out.println("getSum方法的返回值是=" + returnRes);
    }
}

class Person{

    String name;
    int age;

    //1. public 表示方法为公开
    //2. void 表示方法没有返回值
    //3, speak() : 方法名 () 表示没有形式参数列表
    public void speak(){
        System.out.println("每天进步一点.");
    }

    //计算1 +.. + 1000方法
    public void cal01(){
        //循环完成
        int res = 0;
        for (int i = 1;i <= 1000 ; i++){
            res = i + res;
        }
        System.out.println("cal01计算结果:" + res);
    }

    //cal02方法，可以接受n 计算 1+ ..+ n;
    // (int n) 是形参列表，表示当前可以传入一个形参 n
    public void cal02(int n){

        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("the result of cal02 is :" + res);
    }

    //计算两个数的和
    public int getSum(int num1, int num2){
        int res = num1 + num2;
        return res;
    }

    public void getSUM(int a, int b){
        System.out.println(a + b);
    }
}
