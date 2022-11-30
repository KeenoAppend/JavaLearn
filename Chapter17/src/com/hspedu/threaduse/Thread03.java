package com.hspedu.threaduse;

public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();

    }
}

class T1 implements Runnable {

    @Override
    public void run() {
        int count=0;

        while (true) {
            count++;
            System.out.println("hello world" + count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count>60){
                break;
            }
        }
    }
}

class T2 implements Runnable {

    @Override
    public void run() {
        int count=0;

        while (true) {
            count++;
            System.out.println("hi,i am" + count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count>50){
                break;
            }
        }
    }
}