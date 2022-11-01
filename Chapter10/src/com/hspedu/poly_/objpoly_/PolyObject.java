package com.hspedu.poly_.objpoly_;

public class PolyObject {
    public static void main(String[] args) {

        //体验对象的多态
        // Animal 时编译类型， Dog是运行类型
        Animal animal = new Dog();
        //运行到这一句话时，这时执行到改行时，animal的运行类型是 Dog
        animal.cry();

        //当执行该语句时, animal的编译类型依然是 Animal,但是运行类型 变为了 Cat
        animal = new Cat();
        animal.cry();
    }
}
