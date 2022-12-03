package com.hspedu.homework;

public class Homework02 {
    public static void main(String[] args) {
        Take01 take01 = new Take01();
        new Thread(take01).start();
        new Thread(take01).start();

    }
}
class Take01 implements Runnable {
    private static int Money = 10000;

    @Override
    public void run() {
        while (true) {
            //1.使用了 synchronized，实现了线程同步
            //2.当多个线程执行到这里时，就会争夺this对象的锁
            //3.哪个线程拿到了这个锁，就可以去执行锁里面的方法!执行完后，会释放对象锁
            //4.争夺不到的话，就会继续block
            synchronized (this) {
                if ( Money <= 0 ) {
                    System.out.println("钱被取完了！！！");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " 取走了1000,剩余 = " + (Money-=1000));
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}