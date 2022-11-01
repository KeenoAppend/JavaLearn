package com.hspedu.poly_.exercise_;

public class PolyExercise02 {
    public static void main(String[] args) {

        Sub s = new Sub();
        //访问属性，看编译类型
        System.out.println(s.count); // 20

        //访问方法，从运行类型开始查找
        s.display(); // 20

        Base b = s;//向上转型
        System.out.println(b==s);

        //访问属性 看编译类型
        System.out.println(b.count); //10
        b.display(); //20
    }
}

class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}
class Sub extends Base{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}
