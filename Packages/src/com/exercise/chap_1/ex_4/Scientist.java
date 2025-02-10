package com.exercise.chap_1.ex_4;

/**
 * @author Zihao Xiao
 * @date 2025/1/14 17:32
 */
public class Scientist extends Employee {
    double bonus;

    public Scientist(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("科学家" + getName() + "年工资是：" + (getBaseSalary() * getSalMonth() + bonus));
    }
}
