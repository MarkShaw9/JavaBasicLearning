package com.exercise.chap_1.ex_7;

/**
 * @author Zihao Xiao
 * @date 2025/1/16 12:59
 * 编写Doctor类{name, age, job, gender, sal}
 * 以及相应的getter，setter，5个参数的构造器
 * 重写父类Objective的equals方法，并在main中测试创建的两个对象是否相等，相等就是判断属性是否相同
 */
public class main {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Jack", 26,
                "Engineer",'M', 12700);
        Doctor d2 = new Doctor("Jack", 26,
                "Engineer",'M', 12700);
        System.out.println(d1.equals(d2));
    }
}
