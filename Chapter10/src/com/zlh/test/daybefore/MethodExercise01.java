package com.zlh.test.daybefore;

public class MethodExercise01 {
    public static void main(String[] args) {

        int num = 1;
        ME01 me = new ME01();
//        if (me.isOdd(num)){
//            System.out.println(num + " 是奇数");
//        } else {
//            System.out.println(num + " 是偶数");
//        }
        me.print(5,10,'0');
    }
}

class ME01{

    public boolean isOdd(int num){
//        if ( num % 2 != 0 ){
//            return true;
//        }else {
//            return false;
//        }
//        return num % 2 != 0 ? true : false;
        return num % 2 != 0;
    }

    public void print(int row, int col, char c){

        for (int i = 0; i < row ; i++){
            for (int j = 0; j< col; j++){
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
