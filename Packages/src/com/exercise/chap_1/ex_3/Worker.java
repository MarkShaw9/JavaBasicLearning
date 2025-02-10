package com.exercise.chap_1.ex_3;

/**
 * @author Zihao Xiao
 * @date 2024/12/15 15:38
 */
public class Worker extends Employee {
    public Worker(String name, double salaryPerDay, int workDays, double grade) {
        super(name, salaryPerDay, workDays, grade);
    }

    @Override
    public void printTotalSalary() {
        System.out.print("Worker ");
        super.printTotalSalary();
    }
}
