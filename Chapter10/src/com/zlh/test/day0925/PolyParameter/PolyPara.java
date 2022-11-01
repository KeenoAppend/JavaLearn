package com.zlh.test.day0925.PolyParameter;

public class PolyPara {
    public static void main(String[] args) {
        Worker tom = new Worker("tom",1200);
        Manager KA = new Manager("KA",3000,100);

        PolyPara p = new PolyPara();
        p.showAnnual(tom);
        p.showAnnual(KA);

        p.testWork(tom);

    }

    public void showAnnual(Employee employee){
        System.out.println(employee.getAnnual());
    }

    public void testWork(Employee e){
        if ( e instanceof Worker ){ //这时e的编译类型为 employee，无法访问work类独有的成员方法
            ((Worker) e).work();    //所以进行向下转型
        }else if ( e instanceof Manager){
            Manager manager = ( Manager ) e;
            manager.manage();
        }else if ( e instanceof Employee ) {

        }else {
            System.out.println("输入类型错误");
        }
    }
}
