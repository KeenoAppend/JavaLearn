package com.hspedu.poly_.polyarr_;

public class polyArray {
    public static void main(String[] args) {

        //多态数组，存放5个对象
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jackson", 22, 100);
        persons[2] = new Student("smith", 23, 99);
        persons[3] = new Teacher("White", 50, 10000);
        persons[4] = new Teacher("King", 32, 1000);

        //循环遍历方法
        for (int i = 0; i < persons.length; i++) {
            //persons[i] 编译类型是 Person 运行类型是 根据实际情况判断
            System.out.println(persons[i].say());

            //判断该引用的运行类型 是否为 Student
            //使用类型判断和向下转型
            if (persons[i] instanceof Student) {
                Student student = (Student) persons[i]; //向下转型
                student.study();
                //也可以使用一条语句
//                ((Student) persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            }else if (persons[i] instanceof Person) {

            }else {
                System.out.println("类型有误，请检查");
            }
        }

//        persons[1].study();

        //向上转型，无法调用子类的成员方法

    }
}
