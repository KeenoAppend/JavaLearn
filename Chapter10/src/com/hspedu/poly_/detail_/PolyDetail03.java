package com.hspedu.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        // bb 是 BB类型吗

        //用于判断对象 的 运行类型 是否为xx类型或者其子类型
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);

        //用于判断对象 的 运行类型 是否为xx类型或者其子类型
        AA aa = new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);

        Object o = new Object();
        System.out.println( o instanceof AA);
        String str = "Hello";
//        System.out.println(str instanceof AA);
        System.out.println(str instanceof Object);
    }
}
class AA{} //父类
class BB extends AA{} //子类