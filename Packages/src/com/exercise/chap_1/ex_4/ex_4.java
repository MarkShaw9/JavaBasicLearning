package com.exercise.chap_1.ex_4;

/**
 * @author Zihao Xiao
 * @date 2025/1/14 17:18
 * 设计：
 * 父类：Employee，子类：Worker, Peasant, Teacher, Scientist, Waiter
 * （1）Worker, Peasant, Waiter只有基本工资
 * （2）Teacher除了基本工资外，还有上课酬劳（元/天）
 * （3）Scientist除了基本工资外，还有年终奖
 * （4）编写一个测试类，将共类型员工的年工资打印出来
 */
public class ex_4 {
    public static void main(String[] args) {
        Worker Jack = new Worker("Jack", 3000);
        Jack.printSal();

        Teacher Mark = new Teacher("Mark", 5000, 200, 176);
        Mark.setClassDay(176);
        Mark.setClassSalaryPerDay(200);
        Mark.printSal();

        Scientist Harsh = new Scientist("Harsh", 12000, 36000);
        Harsh.printSal();
    }
}
