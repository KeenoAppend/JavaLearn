package com.hspedu.debug_;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {

        int arr[] = { 1, -1 ,10 , -20, 100};

        //我们想了解 该方法的实现方法,按F7
        Arrays.sort(arr);

        for (int i = 0; i< arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
