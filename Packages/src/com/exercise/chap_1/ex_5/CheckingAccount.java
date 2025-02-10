package com.exercise.chap_1.ex_5;

/**
 * @author Zihao Xiao
 * @date 2025/1/16 11:44
 */
public class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}
