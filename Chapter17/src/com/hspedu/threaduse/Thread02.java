package com.hspedu.threaduse;

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Dog implements Runnable {
    int count;
    @Override
    public void run() {
        while (count<10) {
            System.out.println( (count++) +".小狗叫www，线程名= " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
