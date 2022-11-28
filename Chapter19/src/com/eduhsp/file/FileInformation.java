package com.eduhsp.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {

    }

    @Test
    //获取文件信息
    public void info() {
        //创建文件对象 ,参数为文件的路径
        File file = new File("e:\\git-test\\news1.txt");

        String fileName = file.getName();
        //获取文件名
        System.out.println(fileName);
        //获取文件绝对路径
        System.out.println("文件绝对路径: " + file.getAbsolutePath());
        //获取文件的父目录
        System.out.println(file.getParent());
        //获取文件大小(字节)
        System.out.println(file.length());
        //判断文件是否存在
        System.out.println(file.exists());
        //判断该对象是否为文件类型
        System.out.println(file.isFile());
        //判断该对象是否为目录
        System.out.println(file.isDirectory());
    }
}
