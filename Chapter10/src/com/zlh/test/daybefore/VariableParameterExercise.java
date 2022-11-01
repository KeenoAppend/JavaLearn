package com.zlh.test.daybefore;

public class VariableParameterExercise {
    public static void main(String[] args) {
        VPEHspMethod vpeh  = new VPEHspMethod();
        System.out.println(vpeh.showScore("曾炉航",90.1,80.5));
    }
}

class VPEHspMethod {
    //同时返回姓名 和 成绩，将两种数据类型封装为 String类型
    public String showScore(String name, double... scores){
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return name + "必修课程数:" + scores.length + " | " + "课程总分为:" + sum ;
    }
}
