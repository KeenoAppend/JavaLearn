package com.hspedu.poly_;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //使用多态的方法，可以统一管理主任喂食物的问题
    /*
        Animal是编译类型,可以接收Animal子类的对象
     */
    public void Feed(Animal animal,Food food){
        System.out.println("主人" + name + "给宠物 --" + animal.getName() + "吃-- " + food.getName());
    }

//    //主人给小狗喂食
//    public void Feed(Dog dog,Bone bone){
//        System.out.println("主人" + name + "给狗" + dog.getName() + "吃 " + bone.getName());
//    }
//
//    //主人给小猫为食
//    public void Feed(Cat cat,Fish fish){
//        System.out.println("主人" + name + "给狗" + cat.getName() + "吃 " + fish.getName());
//    }
}
