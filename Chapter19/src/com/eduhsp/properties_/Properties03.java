package com.eduhsp.properties_;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {

        File file = new File("./");
        System.out.println(file.getAbsolutePath());

        Properties properties = new Properties();

        properties.setProperty("charset","utf-8");
        properties.setProperty("用户名","汤姆"); //注意中文保存时
        properties.setProperty("pwd","Password");

        properties.store(new FileWriter("./Chapter19/src/mysql2.properties"),"This is a world");
        System.out.println("保存完毕！");
    }
}
