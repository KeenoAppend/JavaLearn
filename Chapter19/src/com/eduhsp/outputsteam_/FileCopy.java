package com.eduhsp.outputsteam_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // 完成文件拷贝
        String srcFilePath = "e:\\git-test\\winbk.jpg";
        String destFilePath = "e:\\git-test\\winbk(1).jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        byte[] buf = new byte[1024];
        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1) {
                //边读边写
                fileOutputStream.write(buf,0,readLen);
            }
            System.out.println("文件复制完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //为了安全性 ，关闭流对象
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
