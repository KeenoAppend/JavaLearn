package com.hspedu.innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        //外部其他类 如何访问静态内部类
        // 1. 在访问权限可以访问时 ，可以直接使用 外部类.内部类 的方式创建对象
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();

        //2. 第二种 在外部类局部位置编写 一个 返回值为静态内部类 的 方法
        // 直接返回 静态内部类 实例对象
        // 在其他外部类中 ,创建Outer对象
        Outer10 outer10 = new Outer10();
        Outer10.Inner10 staticInnerInstance = outer10.getStaticInnerInstance();
        staticInnerInstance.say();

        //3.
        Outer10.Inner10 staticInner = Outer10.getStaticInner();
        staticInner.say();

        //直接访问静态内部类的静态属性
        System.out.println(Outer10.Inner10.name);
    }
}
class Outer10{
    private int n1 = 10;
    private static String name = "zlh";
    private static void hi(){ }

    //静态内部类 放在外部类的成员位置
    // 2.并且 前面有static 修饰
    //3. 静态内部类可以访问外部类所有静态成员 ，但是允许访问 非静态成员
    // 4.可以添加访问修饰符
    static class Inner10{
        public static String name = "ssss";
        public void say(){
            System.out.println(name);
            //Non-static field 'n1' cannot be referenced from a static context
//            System.out.println(n1);
        }
    }

    public void m1(){
        //外部类访问静态内部类
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 getStaticInnerInstance(){
        return new Inner10();
    }

    static public Inner10 getStaticInner(){
        return new Inner10();
    }
}