package com.hspedu.method;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for (int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " is playing PS5. = " + i);
            if ( i==5 ) {
                System.out.println("主线程让子线程 play XBOX");
                t2.join();
                System.out.println("主线程等 子线程玩完 xbox再开始运行");
            }
        }
    }
}
class T2 extends Thread {
    @Override
    public void run() {

        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is playing XBOX. = " + i);
        }

    }
}