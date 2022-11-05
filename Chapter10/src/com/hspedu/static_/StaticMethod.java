package com.hspedu.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
//        tom.payFee(100);
        Stu.payFee(100);

        Stu mary = new Stu("mary");
//        mary.payFee(200);
        Stu.payFee(100);

        Stu.showFee();

        System.out.println(Cal.calSum(45.9,32.2));

    }
}

//开发自己的工具类时，可以使用静态方法
class Cal {
    public static double calSum(double d1, double d2) {
        return d1 + d2;
    }
}

class Stu {
    public String name;

    public Stu(String name) {
        this.name = name;
    }

    public static double fee = 0;

    public static void payFee(double fee) {
        Stu.fee += fee;
    }

    public static void showFee() {
        System.out.println(fee);
    }
}
