package com.eduhsp.transformation;

import java.io.*;

public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        //读取文件
        String filePath = "e:\\git-test\\a.txt";


//        InputStreamReader

        //创建输入流，因为时文本
        //字符输入流默认读取编码格式为 utf-8
        //但是如果 文件的编码类型不是 utf-8。就会发生乱码
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String s = br.readLine();

        System.out.println("读取的内容 : " + s);

        br.close();

    }
}
