package com.hspedu.ticket;
/*
    三个窗口
 */
public class SellTicket {
    public static void main(String[] args) {

//        SellTicket01 s1 = new SellTicket01();
//        SellTicket01 s2 = new SellTicket01();
//        SellTicket01 s3 = new SellTicket01();
//        s1.start();
//        s2.start();
//        s3.start();
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();

    }
}

class SellTicket01 extends Thread {
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum<=0) {
                System.out.println("售票结束了");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() +" 售票窗口,票数 -1,剩余票数: " + (--ticketNum));
        }
    }
}

class SellTicket02 implements Runnable {
    private static int ticketNum = 100;
    @Override
    public void run() {
        while (true) {
            if (ticketNum<=0) {
                System.out.println("售票结束了");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +" 售票窗口,票数 -1,剩余票数: " + (--ticketNum));
        }
    }
}
