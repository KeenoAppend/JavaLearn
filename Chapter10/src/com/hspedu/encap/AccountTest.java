package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account();
        account.setName("jacksmith");
        account.setBalance(6);
        account.setPwd("123");

        account.showInfo();
    }
}
