package com.exercise.chap_1.ex_2;

/**
 * @author Zihao Xiao
 * @date 2024/12/15 14:32
 * 编写老师类
 * （1）要求有属性：姓名name，年龄age，职称post，基本工资salary
 * （2）编写业务方法：introduce()，实现输出一个教师的信息
 * （3）编写教师的三个子类：教授类Professor，副教授类AssistantProfessor，教师类Lecturer。
 *     工资级别分别为1.3，1.2，1.1。在三个子类中都重写父类的introduce()方法
 * （4）定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印
 */
public class ex_2 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jack", 35, "Prof", 12000, 1.3);
        professor.introduce();
    }
}
