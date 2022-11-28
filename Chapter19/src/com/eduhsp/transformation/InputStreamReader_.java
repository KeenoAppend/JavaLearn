package com.eduhsp.transformation;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\git-test\\a.txt";

        // 将FileInputStream 转换为 InputStreamReader
//        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"gbk");
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"gbk"));

        String s = br.readLine();

        System.out.println(s);

        br.close();

    }
}
