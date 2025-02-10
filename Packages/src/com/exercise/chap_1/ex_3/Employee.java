package com.exercise.chap_1.ex_3;

/**
 * @author Zihao Xiao
 * @date 2024/12/15 15:15
 */
public class Employee {
    private String name;
    private double salaryPerDay;
    private int workDays;
    private double grade;

    public Employee(String name, double salaryPerDay, int workDays, double grade) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
        this.workDays = workDays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printTotalSalary() {
        System.out.println(name + "'s total salary is " + salaryPerDay * workDays * grade);
    }
}
