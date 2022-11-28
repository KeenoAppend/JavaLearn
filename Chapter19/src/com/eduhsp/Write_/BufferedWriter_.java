package com.eduhsp.Write_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\git-test\\ok.txt";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("1 :Hello This is 1st sentence");
        bufferedWriter.newLine();
        bufferedWriter.write(" 2:Hello This is 2nd sentence");
        bufferedWriter.newLine();
        bufferedWriter.write("3:Hello This is 2nd sentence");

        bufferedWriter.close();
    }
}
