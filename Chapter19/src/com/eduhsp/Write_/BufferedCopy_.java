package com.eduhsp.Write_;


import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) {
        //因为底层其实是 字符流，所以不要去复制 二进制文件 例如图片音乐视频等...
        String srcFilePath = "e:\\git-test\\story.txt";
        String destFilePath = "e:\\git-test\\story(1).md";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("文件复制完成!");
    }
}
