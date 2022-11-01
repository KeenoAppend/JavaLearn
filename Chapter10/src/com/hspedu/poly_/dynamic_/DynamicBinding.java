package com.hspedu.poly_.dynamic_;

// 动态绑定机制
public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B(); //左边编译类型 右边运行类型
        /*
            多态向上转型
            父类引用调用方法时 看运行类型
         */
        System.out.println(a.sum());  //40
        System.out.println(a.sum1()); //30
    }
}

class A { //父类
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A { //子类
    public int i = 20;

//    public int sum(){
//        return i + 20;
//    }

    public int getI(){
        return i;
    }

//    public int sum1(){
//        return i + 10;
//    }
}
