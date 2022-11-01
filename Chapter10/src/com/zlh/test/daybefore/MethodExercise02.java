package com.zlh.test.daybefore;

public class MethodExercise02 {
    public static void main(String[] args) {

        PersonEx p = new PersonEx();
        p.age = 100;
        p.name = "小明";

        MytoolsEx mytoolsEx = new MytoolsEx();

        PersonEx p2 = mytoolsEx.copPerson(p);
        System.out.println("p .age = "+ p.age +","+"p.name = "+p.name);
        System.out.println("p2 .age = "+ p2.age +","+"p2.name = "+p2.name);
        System.out.println(p==p2);

    }

}

class PersonEx{
    String name;
    int age;
}

class MytoolsEx{

    public PersonEx copPerson(PersonEx p){
        PersonEx p2 =  new PersonEx();
        p2.age = p.age;
        p2.name = p.name;
        return p2;
    }

}
