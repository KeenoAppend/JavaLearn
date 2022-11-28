package com.hspedu.threaduse;

public class Thread01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();
    }
}

class Cat extends Thread {
    @Override
    public void run() {
        int process = 0;
        System.out.println("ZLHOS is installing.....");
        System.out.print("||");
        while (true) {
            try {
                process += 5;
//                System.out.println("ZLHOS is installing....." + (++process) + "%");
                System.out.print("=");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (process > 100) {
                System.out.println(">>\nSystem has been finished!!");
                break;
            }
        }


    }
}