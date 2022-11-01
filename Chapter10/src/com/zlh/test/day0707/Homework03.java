package com.zlh.test.day0707;

public class Homework03 {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("修改后的价格为:" + book.updatePrice(198.5));
    }
}

class Book{
    public double updatePrice(double price){
        double updateprice;
        if ( price > 150 ){
            updateprice = 150;
        }else if ( price > 100 ){
            updateprice = 100;
        }else{
            updateprice = price;
        }
        return updateprice;
    }
}
