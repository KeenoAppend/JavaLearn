package com.hspedu.poly_.polyparameter_;

public class PolyParameter {

    public static void main(String[] args) {
        Worker tom = new Worker("tom",2500);
        Manager milan = new Manager("milan",5000,200000);
        //
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(milan);

        polyParameter.testWork(tom);
        polyParameter.testWork(milan);
    }

    //获取任何员工对象的年薪,并调用
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual()); //动态绑定机制
    }

    //判断一个worker的属性
    public void testWork(Employee e){
        if ( e instanceof Worker ){
            Worker worker = (Worker) e;
            worker.work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }else if ( e instanceof Employee){

        }else {
            System.out.println("请输入正确参数类型");
        }
    }
}
