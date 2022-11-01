package com.hspedu.object_;

public class Equals01 {
    public static void main(String[] args) {

        A a = new A();
        A b = a;
        A c = b;

        System.out.println( b == c);
        System.out.println( a == c );

        B bObj = a;

        System.out.println( bObj == c);

        // equals方法查看
        "hello".equals("abc");


        Integer integer1 = new Integer(5);
        Integer integer2 = new Integer(5);
        System.out.print("integer1 == integer2 --->");
        // == 在用在对象的作用是 比较
        System.out.println(  integer1 == integer2 );//?

        // 比较对象内存储的值是否相等
        System.out.println(integer1.equals(integer2));

        /*
        看到源码中 Integer的 equals方法也被重写了
        public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();
        }
        return false;
    }
         */

        String string1 = new String("hspedu");
        String string2 = new String("hspedu");
        System.out.println(string1 == string2); //false
        System.out.println(string1.equals(string2));    // true
    }
}

class B{}
class A extends B{}
