package com.hspedu.extend_.improve_;

import com.hspedu.extend_.Graduate;
import com.hspedu.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(50);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "银角大王~~";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();
    }
}
