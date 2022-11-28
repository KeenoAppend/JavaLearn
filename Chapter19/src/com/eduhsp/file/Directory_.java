package com.eduhsp.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class Directory_ {
    public static void main(String[] args) {

    }

    @Test
    public void create() {
        String filePath = "e:\\git-test";
        String fileName = "news1.txt";

        File file = new File(filePath, fileName);

        try {
            file.createNewFile();
            System.out.println("文件创建成功,文件名为: " + file.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void m1() {
        //文件删除
        String filePath = "e:\\git-test\\news1.txt";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println(file.getName() + " 已被删除!");
            } else {
                System.out.println("文件删除失败");
            }
        } else {
            System.out.println("该文件不存在!!");
        }
    }

    @Test
    public void m2() {
        //java 中目录其实也当作一种文件
        //文件删除
        String filePath = "e:\\git-test\\dir";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println(file.getName() + " 已被删除!");
            } else {
                System.out.println("文件删除失败");
            }
        } else {
           file.mkdir();
        }
    }

    @Test
    public void m3() {
        //java 中目录其实也当作一种文件
        //文件删除
        String directoryPath = "e:\\git-test\\a\\b\\c";
        File file = new File(directoryPath);

        if (file.exists()) {
            System.out.println("文件夹已存在!!!");
        } else {
            if (file.mkdirs()) {
                System.out.println("文件夹创建成功");
            }else {
                System.out.println("多级文件创建失败!!");
            }
        }
    }
}
