package com.hspedu.debug_;

public class Debug01 {
    public static void main(String[] args) {
        //演示逐行执行
        int sum = 0;
        for (int i = 0; i < 5 ; i++){
            sum += i;
            System.out.print("i = " + i);
            System.out.println(" ,sum = " + sum);
        }
        System.out.println("this loop for is over....");
    }
}
