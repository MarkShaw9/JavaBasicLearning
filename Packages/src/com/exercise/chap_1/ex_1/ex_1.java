package com.exercise.chap_1.ex_1;

/**
 * @author Zihao Xiao
 * @date 2024/12/15 13:47
 * 定义一个Person类{name, age, job}，初始化Person对象数组，有3个Person对象，并按照age从大到小进行排序；“冒泡排序”
 */
public class ex_1 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Amy", 10, "Student");
        people[1] = new Person("Bob", 41, "Worker");
        people[2] = new Person("Cindy", 22, "Waitress");

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }

        Person temp = null;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getAge() < people[j + 1].getAge()) {
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }

        System.out.println("排序后的效果：");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
