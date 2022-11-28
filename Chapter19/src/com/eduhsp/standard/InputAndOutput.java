package com.eduhsp.standard;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {

        //
        //1.编译类型 InputStream
        //2. 运行类型 BufferedInputStream

        //读取键盘输入的内容
        System.out.println(System.in.getClass());


        System.out.println(System.out.getClass());
        //使用out对象，将内容输出到显示器

        //
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(next);
    }
}
