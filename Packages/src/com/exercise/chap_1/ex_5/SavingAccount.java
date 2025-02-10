package com.exercise.chap_1.ex_5;

/**
 * @author Zihao Xiao
 * @date 2025/1/16 11:46
 */
public class SavingAccount extends BankAccount{
    private double interestRate = 0.05;
    private int count = 3;

    public SavingAccount(double balance) {
        super(balance);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void deposit(double amount) {
        //判断是否符合免手续费的条件
        if(count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        //判断是否符合免手续费的条件
        if(count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }

    public void earnMonthlyInterest() {
        count = 3;
        //super.getBalance() = super.getBalance() * (1 + interestRate);
        //super.balance = super.balance * (1 + interestRate);

        //很巧妙的直接将利息存入账户
        super.deposit(getBalance() * interestRate);
    }
}
