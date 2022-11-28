package com.eduhsp.Write_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite_ {
    public static void main(String[] args) {
        String filePath = "e:\\git-test\\note.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath);
            //1.单个字符写入
            fileWriter.write('h');
            //2.字符数组写入
            fileWriter.write(chars);
            //3.写入指定数组的内容(char[] , 下表开始, 填入个数)
            fileWriter.write("Jason4Test".toCharArray(),0,5);
            //4.字符串写入
            fileWriter.write("你好 同学!");
            fileWriter.write("风雨之后必见彩虹!");
            //5.字符串部分写入
            fileWriter.write("yigeiwGiaogGiao",0,4);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //对于 filewrite 必须要关闭流对象，才可以将 内容写入硬盘
            try {
//                fileWriter.flush();
                fileWriter.close(); // 相当于 flush()+close()
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("程序结束!");
    }
}
