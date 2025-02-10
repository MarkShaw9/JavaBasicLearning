package com.javabasics.polymorphism.PolymorphicParameter;

public class Worker extends Employee {
    public Worker() {
    }

    public Worker(String name, double salary) {
        super(name, salary);
    }

    public double getSalary() {
        return super.getSalary();
    }

    public String work() {
        return "This worker is working: " + getName();
    }
}
