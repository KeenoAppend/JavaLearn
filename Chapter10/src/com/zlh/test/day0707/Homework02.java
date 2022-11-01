package com.zlh.test.day0707;

public class Homework02 {
    public static void main(String[] args) {
        A02 a02 = new A02();
        char[] str = {'z','l','h'};
        System.out.println("查找到字符出现下表为: " + a02.find(str, 'h'));
    }
}

class A02{
    public int find(char[] str, char a ){
        int i;
        for ( i = 0 ;i < str.length; i++){
            if ( str[i] == a ){
                break;
            }
        }
        return i;
    }
}
