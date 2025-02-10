package com.exercise.chap_1.ex_4;

/**
 * @author Zihao Xiao
 * @date 2025/1/14 17:30
 */
public class Teacher extends Employee{
    double classSalaryPerDay;
    int classDay;

    public Teacher(String name, double baseSalary, double classSalaryPerDay, int classDay) {
        super(name, baseSalary);
        this.classSalaryPerDay = classSalaryPerDay;
        this.classDay = classDay;
    }

    public double getClassSalaryPerDay() {
        return classSalaryPerDay;
    }

    public void setClassSalaryPerDay(double classSalaryPerDay) {
        this.classSalaryPerDay = classSalaryPerDay;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    @Override
    public void printSal(){
        System.out.println("老师" + getName() + "年工资是：" + (getBaseSalary() * getSalMonth() + classSalaryPerDay * classDay));
    }
}
