package com.exercise.chap_1.ex_3;

/**
 * @author Zihao Xiao
 * @date 2024/12/15 15:10
 * @description
 * 通过继承实现员工工资核算打印功能
 * 父类：员工类
 * 子类：经理类，工人类
 * （1）经理工资 = 1000 + 日工资 * 天数 * 等级（1.2）
 * （2）工人工资 = 日工资 * 天数 * 等级（1.0）
 * （3）员工属性：姓名，日工资，工作天数
 * （4）员工方法：打印工资条
 * （5）子类都需要重写打印工资条方法
 * （6）main中定义并初始化一个经理/工人对象，调用打印工资条方法
 */
public class ex_3 {
    public static void main(String[] args) {
        Manager manager = new Manager("Amy", 200, 10, 1.2, 1200);
        manager.printTotalSalary();

        Worker worker = new Worker("Jim", 100, 15, 1.0);
        worker.printTotalSalary();
    }
}
