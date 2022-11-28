package com.eduhsp.properties_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\ZLH\\IdeaProjects\\JavaLearn\\Chapter19\\src\\mysql.properties";

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = "";

        while ((line = br.readLine()) != null) {
//            System.out.println(line);
            String[] split = line.split("=");
            System.out.println(split[0] + " 的值为 :" +split[1]);
        }



        br.close();
    }
}
