package com.eduhsp.properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\ZLH\\IdeaProjects\\JavaLearn\\Chapter19\\src\\mysql.properties";

        Properties properties = new Properties();

        properties.load(new FileReader(filePath));
        properties.list(System.out);
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println("用户名="+user);
        System.out.println("密码="+pwd);
    }
}
