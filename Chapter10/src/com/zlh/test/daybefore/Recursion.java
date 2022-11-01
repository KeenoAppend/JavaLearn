package com.zlh.test.daybefore;

public class Recursion {
    public static void main(String[] args) {

        T test = new T();
        test.testT(4);
    }
}

class T{
    public void testT(int n){
        if (n > 2){
            testT(n-1);
        } else {
            System.out.println("n = " + n);
        }
    }
}
