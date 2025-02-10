package com.exercise.chap_1.ex_3;

/**
 * @author Zihao Xiao
 * @date 2024/12/15 15:20
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salaryPerDay, int workDays, double grade, double bonus) {
        super(name, salaryPerDay, workDays, grade);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printTotalSalary() {
        System.out.println("Manager " + getName() + "'s total salary is " + (getSalaryPerDay() * getWorkDays() * getGrade() + bonus));
    }
}
