package com.exercise.chap_1.ex_7;

/**
 * @author Zihao Xiao
 * @date 2025/1/16 13:08
 */
public class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
        //判断是否是同一个对象
        if (this == obj) {
            return true;
        }

        //判断obj是否是doctor类型或者子类
        if (!(obj instanceof Doctor)) {
            return false;
        }

        //向下转型，因为obj的运行类型是doctor或者其子类型
        Doctor doctor = (Doctor) obj;
        return this.name.equals(doctor.name) && this.age == doctor.age
                && this.job.equals(doctor.job) && this.gender == doctor.gender;
    }
}
