package com.exercise.chap_1.ex_4;

/**
 * @author Zihao Xiao
 * @date 2025/1/14 17:26
 */
public class Worker extends Employee {
    public Worker(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public void printSal(){
        System.out.print("工人");
        super.printSal();//使用了父类的方法
    }
}
