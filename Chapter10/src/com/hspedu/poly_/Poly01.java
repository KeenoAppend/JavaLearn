package com.hspedu.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog chaiquan = new Dog("chaiquan");
        Bone big_bone = new Bone("Big bone");

        tom.Feed(chaiquan,big_bone);


        Cat c = new Cat("小花猫");
        Fish f = new Fish("小鱼");
        tom.Feed(c,f);

        System.out.println("-------------------");
        Pig pig = new Pig("小猪");
        Rice rice = new Rice("白米饭");
        tom.Feed(pig,rice);

    }
}
