package com.hspedu.threaduse;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();
//        cat.run();
        System.out.println("主线程执行 :" + Thread.currentThread().getName());
        for (int i = 0; i < 120; i++) {
            System.out.println("主线程: i=" + i);
            Thread.sleep(1000);
        }
    }
}

class Cat extends Thread {
    @Override
    public void run() {
        int process = 0;
        int times = 0;
        while (true) {
            System.out.println("秒,我是小猫 " + (++times)+ "线程名=" + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 800) {
                break;
            }
        }

    }
}