package com.zlh.test.daybefore;

public class HanoTower {
    public static void main(String[] args) {
        HTtest hTtest = new HTtest();
        hTtest.move(2,"塔1","塔2","塔3");
    }
}

class HTtest{
    public void move(int n, String a, String b, String c){
        if ( n == 1 ){
            System.out.println( a + " 移动到 " + c);
        }else {
            move( n-1, a ,c ,b );
            System.out.println(a + " 移动到 " + b);
            move(n , a , b ,c);
        }
    }
}
