package com.exercise.chap_1.ex_2;

/**
 * @author Zihao Xiao
 * @date 2024/12/15 14:40
 */
public class Professor extends Teacher {

    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    public void introduce() {
        System.out.println("Professor Introduce:");
        super.introduce();
    }
}
