package com.hspedu.encap;

public class Account {

    private String name;
    private double balance;
    private String pwd;

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( name.length() >= 2 && name.length() <= 4){
            this.name = name;
        }else {
            System.out.println("输入的名字不合法，需要在2到4个字符内，默认设置为无名");
            this.name = "无名";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if ( balance > 20 ){
            this.balance = balance;
        }else {
            System.out.println("余额必须大于20，默认为0");
            this.balance = 0;
        }

    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if ( pwd.length() == 6 ){
            this.pwd = pwd;
        }else {
            System.out.println("密码必须是6为，默认密码为6个0");
            this.pwd = "000000";
        }

    }
    //显示账号信息
    public void showInfo(){
        System.out.println("账号信息, name= " + name + "余额=" + balance + ",密码=000000");
    }
}
