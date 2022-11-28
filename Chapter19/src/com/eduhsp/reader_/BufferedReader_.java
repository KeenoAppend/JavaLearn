package com.eduhsp.reader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "e:\\git-test\\story.txt";
        String line;
        BufferedReader bufferedReader = null;

        bufferedReader = new BufferedReader(new FileReader(filePath));

        while ((line = bufferedReader.readLine()) != null ) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
