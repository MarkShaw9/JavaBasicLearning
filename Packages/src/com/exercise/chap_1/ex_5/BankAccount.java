package com.exercise.chap_1.ex_5;

/**
 * @author Zihao Xiao
 * @date 2025/1/16 11:36
 * （1）在此基础上扩展新类CheckingAccount，对每次deposit和withdraw都收取1块的手续费
 * （2）扩展一个新类SavingAccount，每个月产生利息，且每个月有3次免手续费存取款操作
 * （3）体会重写的好处
 */
public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
