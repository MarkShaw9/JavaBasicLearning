package com.javabasics.inheritance;

public class Student {
    String name;
    int age;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Name : " + name);
    }
}
