package com.hspedu.override_;

public class Student extends Person {

    private int id;
    private double score;

    public Student(int age, String name, int id, double score) {
        super(age, name);//会自动调用父类构造器
        this.id = id;
        this.score = score;
    }

    public String Say(){
        //体现出 super的一个好处.
        return super.Say() + ",我是" + id + "，分数为:" + score;
    }
}
