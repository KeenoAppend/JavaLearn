package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {

        Person p = new Person();
        p.setAge(30);
        p.setName("那是阵地牛p上下车");
        p.setSalary(300000);
        System.out.println(p.info());
        System.out.println("==========================");

        Person smith = new Person("smith", 300, 12000);
        System.out.println(smith.info());
    }
}

class Person{

    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( name.length() >= 2 && name.length() <= 6 ){
            this.name = name;
        }else {
            System.out.println("输入姓名不合法，字符数量应该在2到6个字符之间");
            this.name = "unknown";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age >=2 && age <= 120 ){
            this.age = age;
        }else {
            System.out.println("输入的年龄不符合要求，需要在(2 - 120)之间");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info(){
        return "Personal information: name=" + name + " age=" + age + " salary= " + salary;
    }
}
