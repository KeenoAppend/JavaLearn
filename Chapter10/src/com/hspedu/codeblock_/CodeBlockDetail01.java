package com.hspedu.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
//        DD dd = new DD();
//        DD dd1 = new DD();
        System.out.println(DD.n1);
        //
//        AA aa = new AA();

//        AA aa2 = new AA();

//        System.out.println(Cat.n1);

    }
}

class DD{
    public static int n1 = 999;
    static {
        System.out.println("DD 静态代码块被执行...");
    }

    //只有再 new 对象时被调用，而且是每创建一次，就调用一次(和类加载无关)
    {
        System.out.println("DD 普通代码块被执行...");
    }
}

class Cat {
    public static int n1 = 999;

    static {
        System.out.println("Cat静态代码块被执行!!");
    }
}

class BB {
    static {
        System.out.println("BB 的静态代码块被执行...");
    }
}

class AA extends BB {
    static {
        System.out.println("AA 的静态代码块被执行...");
    }
}
