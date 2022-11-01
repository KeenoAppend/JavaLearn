package com.hspedu.extend_;
//输入 crtl + H 可以看到类的继承关系图
public class Sub extends Base { //子类

    public Sub(String name,int age){
        //1.想要在子类中调用父类的默认无参构造器,,直接使用 super() 即可
        //super();

        //2.要调用父类中 Base(String name);
        //super("king2");

        //3.要调用 父类中 Base(String name,int age)
        super("zlh",22);
        System.out.println("子类的Sub(String anme, int age)...被调用");
    }


    //子类构造器
    public Sub(){
        //super();//默认调用父类的无参构造器
        super("simth",10);
        System.out.println("子类构造器sub()被调用....");
    }

    public Sub(String name){
        super("jakc",30);
        //do nothing
        System.out.println("子类Sub(string name)被调用");
    }

    public void sayOK(){        //子类方法
        // 子类中不能访问父类中的私有属性
        // 非私有的属性和方法可以在子类中访问
//        System.out.println( n1 + " " + n2 + " " + n3 + " " + n4);
        System.out.println( n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
//        test400();

        //通过条用父类中公共方法使用私有属性
        System.out.println("n4 = " + getN4() );

        calltest400();
    }
}
