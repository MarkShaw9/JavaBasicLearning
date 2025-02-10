package com.exercise.chap_1.ex_4;

/**
 * @author Zihao Xiao
 * @date 2025/1/14 17:25
 */
public class Employee {
    private String name;
    private double baseSalary;
    private int salMonth = 12;

    public void printSal(){
        System.out.println(name + "年工资是：" + (baseSalary * salMonth));
    }

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }
}
