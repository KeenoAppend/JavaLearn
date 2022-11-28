package com.hspedu.innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();

        //外部其他类 使用成员内部类的三种方式
        // 1.
        // 2. 在外部类中 写一个方法 方法 可以返回一个inner对象

        Outer08 outer081 = new Outer08();
        Outer08.Inner08 inner081 = outer081.new Inner08();

        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();

        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();
    }
}
class Outer08{
    private String name = "sss";
    public int age = 10;

    //成员内部类 在外部类的成员位置定义
    // 所以可以使用访问修饰符
    class Inner08{
        private double sal = 99.9;
        //成员内部类 和 外部类的成员 重名, 会遵守就近原则

        private double age = 66.6;
        //如果非要访问外部类成员则需要

        public void say(){
            System.out.println("成员内部类可以访问外部类私有和公有属性,name=" + name + " , age = " + Outer08.this.age);
        }
    }

    public void t1(){
        //使用成员内部类
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }

    public Inner08 getInner08Instance(){
        return new Inner08();
    }
}