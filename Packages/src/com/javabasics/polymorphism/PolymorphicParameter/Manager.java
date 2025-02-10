package com.javabasics.polymorphism.PolymorphicParameter;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getAnnual() {
        return super.getSalary() * 12 + bonus;
    }

    public String manage() {
        return "This manager is managing: " + getName();
    }
}
