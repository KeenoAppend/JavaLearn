package com.hspedu.codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("阿凡达4");
        Movie movie2 = new Movie("妇联1", 100, "PUBG");
    }

}

class Movie{
    private String name;
    private double price;
    private String director;

    {
        System.out.println("电影屏幕打开1");
        System.out.println("电影屏幕打开2");
        System.out.println("电影屏幕打开3");
    };

    public Movie(String name) {
        System.out.println("Movie(String name)被调用");
        this.name = name;

//        System.out.println("电影屏幕打开1");
//        System.out.println("电影屏幕打开2");
//        System.out.println("电影屏幕打开3");
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
//        System.out.println("电影屏幕打开1");
//        System.out.println("电影屏幕打开2");
//        System.out.println("电影屏幕打开3");
    }

    public Movie(String name, double price, String director) {
        System.out.println("Movie(String name, double price, String director)被调用");
        this.name = name;
        this.price = price;
        this.director = director;

//        System.out.println("电影屏幕打开1");
//        System.out.println("电影屏幕打开2");
//        System.out.println("电影屏幕打开3");
    }
}
