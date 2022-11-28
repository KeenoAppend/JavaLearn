package com.eduhsp.inputstream_;

import com.eduhsp.outputsteam_.Dog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {
        String filePath = "e:\\git-test\\data.dat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());

        //编译类型 时Obj   运行类型时 dog
        //想要调用 dog的方法，需要向下转型
        Object dog = ois.readObject();
        System.out.println("对象类型 :" + dog.getClass());
        System.out.println("反序列化对象 : " + dog);

        Dog dog2 = (Dog) dog;
        System.out.println(dog2.getName());
        System.out.println(dog);



        ois.close();
    }
}
