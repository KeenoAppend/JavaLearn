package com.eduhsp.transformation;

import java.io.*;

public class OutputStreamWrite_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\git-test\\hsp.txt";
        String charSet = "utf-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath),charSet);

        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("Helllo zlh 开始你的炸弹那双休!!");
        bw.close();
        System.out.println("文件按照 " + charSet + " 格式输出");

    }
}
