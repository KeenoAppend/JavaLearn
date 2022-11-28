package com.eduhsp.outputsteam_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 实现序列化 将数值和数据类型保存在文件中
public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {
        String filePath = "e:\\git-test\\data.dat";

        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(filePath));
        oo.writeInt(100); //序列化时 int --> 自动转为 Integer
        oo.writeBoolean(true); // boolean --> Boolean
        oo.writeChar('h');
        oo.writeDouble(3.1456);
        oo.writeUTF("Hello World");

        oo.writeObject(new Dog("jason",3,"China","black"));

        oo.close();
        System.out.println("数据序列化完毕!");


    }
}
