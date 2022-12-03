//package com.hspedu.method;
//
//public class ThreadMethod01 {
//    public static void main(String[] args) throws InterruptedException {
//        T t = new T();
//        t.setName("ZLH");
//        t.setPriority(1);
//        t.start();
//
//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(5000);
//            System.out.println("hi " + i);
//        }
//
//        System.out.println(t.getName() + " 's priority is " + t.getPriority());
//
//        t.interrupt();
//    }
//}
//
//class T extends Thread {
//    @Override
//    public void run() {
//        while (true) {
//
//            for (int i = 0; i < 100; i++) {
//                System.out.println(Thread.currentThread().getName() + " is playing PS5. = " + i);
//            }
//
//            try {
//                System.out.println(Thread.currentThread().getName() + " is sleeping .....");
//                Thread.sleep(20000);
//            } catch (InterruptedException e) {
//                System.out.println(Thread.currentThread().getName() + " has been interrupted");
//            }
//        }
//    }
//}
