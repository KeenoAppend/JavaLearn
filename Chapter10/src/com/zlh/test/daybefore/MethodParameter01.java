package com.zlh.test.daybefore;

public class MethodParameter01 {
    public static void main(String[] args) {

        int a= 10,b=20;
        MP01 mp01 = new MP01();//在堆中创建对象

        mp01.swap(a,b); //swap方法重新在栈中开辟独立空间。
        System.out.println("在main栈中的数据 a= " + a + "\tb= " + b);

    }
}

class MP01{

    public void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("在swap栈中的数据 a= " + a + "\tb= " + b);
    }

}
