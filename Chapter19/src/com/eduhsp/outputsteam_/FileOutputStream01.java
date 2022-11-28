package com.eduhsp.outputsteam_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {
    /**
     *  使用 FileOutPutstream 写出数据到文件
     */
    public static void main(String[] args) {

    }
    @Test
    public void writeFile() {
        //如果该路径下五次文件，会自动创建
        String filePath = "e:\\git-test\\a.txt";
        FileOutputStream fileOutputStream = null;
        String str = " World!";
        try {
            fileOutputStream = new FileOutputStream(filePath,true);
            //将 string转为 字节数组
            //1.一个字符的输出
            //2.一次性输出
//            fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes(),0,str.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
