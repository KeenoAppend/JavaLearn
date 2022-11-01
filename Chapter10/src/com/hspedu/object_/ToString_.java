package com.hspedu.object_;

public class ToString_ {
    public static void main(String[] args) {

        /*
        Object 的 toString源码
        1. getClass().getName()  返回对象的全类名
        2. Integer.toHexString(hashCode()  //将对象的hashcode值转为16进制字符串

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
         */

        Monster monster = new Monster("zlh", "coder", 1000);

        /*
        com.hspedu.object_.Monster@1b6d3586
        monster的 hashcode= 460141958
         */
        System.out.println(monster.toString());
        System.out.println("monster的 hashcode= " + monster.hashCode());

        System.out.println(monster);
    }
}
class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    //重写toString方法

    @Override
    public String toString() {  //默认重写后，将对象的属性值输出,也可以自己定制
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}