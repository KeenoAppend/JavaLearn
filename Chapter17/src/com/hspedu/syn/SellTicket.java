package com.hspedu.syn;
/*
    三个窗口
 */
public class SellTicket {
    public static void main(String[] args) {
        SellTicket03 s = new SellTicket03();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
    }
}
//
//class SellTicket03 implements Runnable {
//    private static int ticketNum = 100;
//    @Override
//    public synchronized void run() { //在同一个时刻，只能有一个线程执行run()
//        while (true) {
//            if (ticketNum<=0) {
//                System.out.println("售票结束了");
//                break;
//            }
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() +" 售票窗口,票数 -1,剩余票数: " + (--ticketNum));
//        }
//    }
//}


//使用同步方法

class SellTicket03 implements Runnable {
    private static int ticketNum = 100;
    private boolean loop = true;

    //使用同步方法,在同一个时刻，只能有一个线程来操作run()方法
    public synchronized void sell() {
        if (ticketNum<=0) {
            System.out.println("售票结束了");
            loop=false;
            return;
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +" 售票窗口,票数 -1,剩余票数: " + (--ticketNum));
    }
    @Override
    public void run() {
        while (loop) {
            sell(); //sell方法是一个同步方法
        }
    }
}
