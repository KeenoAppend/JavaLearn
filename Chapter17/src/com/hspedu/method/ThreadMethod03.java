package com.hspedu.method;
//守护线程.
//希望主线程推出后，子线程也关闭
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);//先要设置守护线程

        myDaemonThread.start();
        for (int i = 10; i >= 1; i--) {
            System.out.println("电源开始断电....." + i);
            Thread.sleep(1000);
        }
        System.out.println("电源已关闭！！");
    }
}
class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for (;;){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("疯狂玩ps5......");
        }

    }
}
