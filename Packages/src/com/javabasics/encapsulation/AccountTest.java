package com.javabasics.encapsulation;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("我是钢铁侠",665876958,"ironman");
        account1.getInfo();
    }
}

class Account {
    public String name;
    private double balance;
    private String pwd;

    //一般提供两个构造器
    public Account() {
    }

    //有参构造器
    public Account(String name, double balance, String pwd) {
        setName(name);
        setBalance(balance);
        setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //名字长度必须2，3，4位
        if(name.length() == 2 || name.length() == 3 || name.length() ==4) {
            this.name = name;
        }else {
            this.name = "无名氏";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        //余额需要大于20
        if (balance >= 20) {
            this.balance = balance;
        }else {
            this.balance = 0;
            System.out.println("余额必须大于20，否则设置为0");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        //密码必须6位，否则设置为123456
        if(pwd.length() == 6) {
            this.pwd = pwd;
        }else {
            this.pwd = "123456";
            System.out.println("密码不是6位，已设为默认密码123456");
        }
    }

    public void getInfo() {
        System.out.println(this.name + this.balance + this.pwd);
    }
}