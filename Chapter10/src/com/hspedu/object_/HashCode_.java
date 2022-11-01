package com.hspedu.object_;

public class HashCode_ {
    public static void main(String[] args) {

        AA aa1 = new AA();
        AA aa2 = new AA();
        AA aa3 = aa1;       //指向同一个对象

        //两个对象指向不同的空间，即期hashcode此时的值是不同的
        System.out.println( "aa1.hashCode() = " + aa1.hashCode());
        System.out.println( "aa2.hashCode() = " + aa2.hashCode());

        /*
            aa1.hashCode() = 460141958
            aa2.hashCode() = 1163157884
            aa3.hashcode = 460141958
         */
        System.out.println("aa3.hashcode = " + aa3.hashCode());


    }
}

class AA{

}
