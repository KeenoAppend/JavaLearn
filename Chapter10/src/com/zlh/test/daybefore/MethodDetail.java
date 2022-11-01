package com.zlh.test.daybefore;

public class MethodDetail {
    public static void main(String[] args) {
        AA a = new AA();
        int[] res = a.getNumAndSub(10,20);
        System.out.println("加=" + res[0]);
        System.out.println("见=" + res[1]);

        a.f2();
    }
}

class AA{

    //1.  方法的最多有一个返回值，()如何返回多个值，数组
    //2. 返回类型可以为任意类型，可以是引用类型
    public int[] getNumAndSub(int num1, int num2){
        int[] res = new int[2];
        res[0] = num1 + num2;
        res[1] = num1 - num2;
        return  res;
    }

    //如果方法是 void，则方法体中可以没有 return语句，或着只写 return
    //方法名最好是见名知意
    public void f2(){
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        int n = 10;
        return;
    }
}
