package com.zlh.test.daybefore;

public class VariableParameter {
    public static void main(String[] args) {
        HspMethod hspMethod = new HspMethod();
        System.out.println(hspMethod.sum(1, 5, 100));
        System.out.println(hspMethod.sum(1, 20));
    }
}

class HspMethod{
    public int sum(int... nums){
        //int ... 代表可变参数；
        //nums 可以当作数组使用
        System.out.println("传入参数的个数是:" + nums.length);
        int res = 0;
        for ( int i = 0; i < nums.length ; i++ ){
            res += nums[i];
        }
        return res;
    }
}
