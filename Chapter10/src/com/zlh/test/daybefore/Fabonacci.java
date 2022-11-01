package com.zlh.test.daybefore;

public class Fabonacci {
    public static void main(String[] args) {

        Fab fab = new Fab();
        int n = 9;
//        int i = fab.fabonacci(n);
//        if ( n >= 1) {
//            System.out.println("当n=" + n + "是,对应的斐波那契数为:"+i);
//        }
        int peachNum = fab.peaches(n);
        if ( n >= 1){
            System.out.println("在第"+ n +"天。桃子数量为:"+ peachNum);
        }

        int facNum = fab.factorial(0);
        System.out.println(facNum);
    }
}

class Fab{

    public int factorial(int n){
        if (n == 1){
            return 1;
        }else if (n > 1){
            return factorial(n -1) * n;
        }else if (n ==0){
            return 0;
        }else {
            System.out.println("请输入有效数据");
            return -1;
        }

    }

    public int fabonacci(int n){
        if ( n >= 1){
            if ( n == 1 || n == 2){
                return 1;
            }else {
                return fabonacci(n-1)+fabonacci(n-2);
            }
        }else {
            System.out.println("输入的数字必须 >= 1");
            return -1;
        }
    }

    public int peaches(int day){

        if (day==10){
            return 1;
        }else if ( day >=1 || day <= 9 ){
            return (peaches(day+1) + 1) * 2;
        }else {
            System.out.println("请输入有效天数,在1-10天之间");
            return -1;
        }

    }
}
