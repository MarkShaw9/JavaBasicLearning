package com.exercise.chap_1.ex_5;

/**
 * @author Zihao Xiao
 * @date 2025/1/16 11:56
 */
public class ex_5 {
    public static void main(String[] args) {
        //测试CheckingAccount
        CheckingAccount a1 = new CheckingAccount(100);
        a1.deposit(200);
        CheckingAccount a2 = new CheckingAccount(100);
        a2.withdraw(50);
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());

        //测试SavingAccount
        SavingAccount s1 = new SavingAccount(1000);
        s1.deposit(100);
        s1.deposit(100);
        s1.deposit(100);
        System.out.println(s1.getBalance());
        s1.withdraw(50);
        System.out.println(s1.getBalance());

        s1.earnMonthlyInterest();
        System.out.println(s1.getBalance());
        s1.withdraw(50);
        System.out.println(s1.getBalance());
    }
}
