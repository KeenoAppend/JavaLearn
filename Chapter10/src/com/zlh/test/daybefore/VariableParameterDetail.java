package com.zlh.test.daybefore;

public class VariableParameterDetail {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        VPDtest vpDtest = new VPDtest();
        vpDtest.f1(arr);
    }
}

class VPDtest{
    public void f1(int... nums ){
        System.out.println("可变参数个数:" + nums.length);
    }
//   可变参数可以和基本参数放在一起，但是必须放在最后
//    public void f2(double... d1, double d2){
//
//    }
    public void f2(double d1, double... nums){}

    //可变参数在方法中，最多只能有一个
//    public void f2(int... d1, double... nums){}

}
