package com.zlh.test.daybefore;

public class OverLoadExercise {
    public static void main(String[] args) {
        MethodOE methodOE = new MethodOE();
        methodOE.m(10);
        methodOE.m(10,20);
        methodOE.m("一切都会好起来的...");

        System.out.println(methodOE.max(10, 24));
        System.out.println(methodOE.max(10.0,21.4));
        System.out.println(methodOE.max(10.0,1.4,30));

    }
}

class MethodOE{
    public void m(int n){
        System.out.println("平方= " + (n * n));
    }
    public void m(int n1, int n2){
        System.out.println("乘机=" + ( n1 * n2 ));
    }
    public void m(String str){
        System.out.println(str);
    }

    public int max(int n1, int n2){
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2){
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2, double n3){
        double max = n1 > n2 ? n1 : n2;
        return max > n3 ? max : n3;
    }
}
