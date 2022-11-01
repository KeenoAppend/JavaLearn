package com.hspedu.extend_.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("Intel 9600KF",16,1024,"先马");
        pc.PrintInfo();

        NotePad notePad = new NotePad("i7 740",4,16,"HuaWei");
        notePad.PrintInfo();

        DIYPC diypc = new DIYPC("444",11,1234);
        diypc.PrintInfo();
    }
}


