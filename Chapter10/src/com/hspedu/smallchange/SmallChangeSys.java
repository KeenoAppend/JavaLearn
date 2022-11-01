package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    // **** 化繁为简 *****
    // 1. 先完成显示菜单,并可以选择菜单,给出提示
    // 3. 收益入账
    // 4. 退出程序

    //7.判断收益入账的金额 的合理性

    public static void main(String[] args) {

        //定义相关变量
        boolean loop = true;

        Scanner scanner = new Scanner(System.in);
        String key = "";

        // 2.完成零钱通明细
        String details = "--------------零钱通明细----------------";

        //3.完成收益入账
        double  money = 0;
        double balance = 0;
        Date date = null;       //date是 java.util.Date类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //可以用此方法 格式化时间

        //4.定义新的变量记录 消费信息
        String note = "";

        //

        do {
            System.out.println("================零钱通===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出此程序");

            System.out.print("请选择(1-4): ");

            key = scanner.next();

            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额: ");
                    money = scanner.nextDouble();
                    //money的范围进行判断校验
                    /*
                        在判断时 , 尽量找 不正确 的条件
                     */
                    if (money <= 0){
                        System.out.println("收益入账金额应大于零!");
                        break;
                    }


                    balance += money;
                    date = new Date(); //获取当前时间,默认获取的格式不符合要求
//                    System.out.println(sdf.format(date));
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额: " + balance;

                    break;
                case "3":
                    System.out.print("请输入消费金额:");
                    //对输入的金额进行校验
                    money = scanner.nextDouble();
                    //找出金额不正确的情况
                    if (money <= 0 || money > balance){
                        System.out.println("你的消费金额应该大于0,并在额度内");
                    }
                    balance -= money;

                    System.out.print("请输入消费说明:");
                    note = scanner.next();

                    //拼接记录
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额: " + balance;
                    break;
                case "4":
                    //(1)定义一个变量，接收输入的字符串
                    String choice = "";
                    //(2) 用循环 while break 用来处理接收
                    while (true){
                        System.out.print("确定要退出吗?(y/n) :");
                        choice = scanner.next();
                        //一段代码尽量只完成一个功能,最好不要整合在一起
                        if ("y".equals(choice) || "n".equals(choice)){
                            break;
                        }
                    }
                    if (choice.equals("y")){
                        loop = false;
                    }
//                    System.out.println("4 退出此程序");
//                    loop = false;
                    break;
                default:
                    System.out.println("输入错误,请输入(1-4)之内的数字!!");
            }

        } while (loop);
        System.out.println("---------零钱通已经退出-------------");
    }
}
