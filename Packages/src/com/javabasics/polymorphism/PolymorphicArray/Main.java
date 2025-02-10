package com.javabasics.polymorphism.PolymorphicArray;
/*现有一个继承结构：
    要求创建1个Person对象、2个Student对象、2个Teacher对象
    统一放在一个多态数组里
    并调用每个对象的say()方法
    再分别调用Student类中特有的study()方法和Teacher类中的teach()方法
*/
public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("Jack", 12);
        people[1] = new Teacher("Tom", 30, 200000);
        people[2] = new Teacher("Jerry", 67,333333);
        people[3] = new Student("Mark", 21, 88);
        people[4] = new Student("Jackey", 18, 75);
        //遍历整个数组
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].say());
        }

        for (int i = 0; i < people.length; i++) {
            //先判断运行类型，再向下转型，再调用特有方法
            if (people[i] instanceof Student) {
                Student student = (Student) people[i];
                student.study();
//                ((Student)people[i]).study();
            }else if (people[i] instanceof Teacher) {
                Teacher teacher = (Teacher) people[i];
                teacher.teach();
            }else {
                System.out.println("This person named " + people[i].name + " is not students or teachers");
            }
        }
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String say() {
        return "name:" + name + "\t" + "age:" + age;
    }
}

class Teacher extends Person {
    double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String say() {
        return super.say() + "\t" + "salary:" + salary;
    }

    public void teach() {
        System.out.println("Who's teaching:" + name);
    }
}

class Student extends Person {
    double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say() {
        return super.say() + "\t" + "score:" + score;
    }

    public void study() {
        System.out.println("Who's studying:" + name);
    }
}