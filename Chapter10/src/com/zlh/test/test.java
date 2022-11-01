package com.zlh.test;

public class test {
    public static void main(String[] args) {

        int index = 4;

        int[] houses = {1, 2, 3, 4, 0, 6, 7, 8, 9, 10};

        int houseNum = 9;


        for (int i = index; i < houses.length - 1; i++) {
            houses[i] = houses[i+1];
//            System.out.print(houses[i] + " ");
        }
        houses[houses.length - 1] = 0;

        for (int i = 0; i < houses.length; i++) {
            System.out.print(houses[i] + " ");
        }



    }
}
