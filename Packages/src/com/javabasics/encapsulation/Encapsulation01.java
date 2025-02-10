package com.javabasics.encapsulation;

import java.util.Scanner;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person aPerson = new Person();
        aPerson.setName("JohnWillson");
        aPerson.setAge(130);
        aPerson.setSalary(5600.0);
        aPerson.getInfo();
    }
}

//不能随便查看人的年龄，工资
//并对设置的年龄进行合理的验证，年龄合理就设置，否则默认
//年龄1-120，工资年龄不能直接查看，name在2-6个字符
class Person {
    public String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //限制name长度2-6个字符，否则设置为一个默认值
        if(name.length() >=2 && name.length() <= 6) {
            this.name = name;
        }else {
            this.name = "无名氏";
            System.out.println("名字长度无效，已设置为：" + this.name);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //限制age大小1-120直接，否则设置为一个默认值
        if(age >= 1 && age <= 120) {
            this.age = age;
        }else {
            this.age = 18;
            System.out.println("年龄大小无效，已设置为：" + this.age);
        }
    }

    public double getSalary() {
        System.out.println("请输入管理员密码以查看薪资：");
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt() == 123) {
            return salary;
        }else {
            System.out.println("密码错误，查看失败");
            return 0;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void getInfo() {
        System.out.println(this.name + "\t" + this.getAge() + "\t" + this.getSalary());
    }
}