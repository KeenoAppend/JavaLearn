package com.eduhsp.file;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }

    @Test
    public void creat01() {
        String filePath = "e:\\git-test\\news1.txt";
        //在内存中创建文件操作对象,
        File file = new File(filePath);

        try {
            //使用方法 对象才会开始有创建动作
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void create02() {
        File parentFile = new File("e:\\git-test");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);

        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void creat03() {
        String parentFile = "e:\\git-test";
        String fileName = "news3.txt";
        File file = new File(parentFile, fileName);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

