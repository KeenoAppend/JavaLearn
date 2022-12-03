package com.hspedu.method;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        Thread t3 = new Thread(new T3());

        for (int i = 1; i <= 10; i++) {
            System.out.println("hi " + i);
            if (i==5) {
                t3.start();
                t3.join();
            }
        }
    }
}

class T3 implements Runnable {
    private int count;
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + (count++));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
