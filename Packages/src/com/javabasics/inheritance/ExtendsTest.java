package com.javabasics.inheritance;

public class ExtendsTest {
    public static void main(String[] args) {
//        Pupil pupil = new Pupil();
//        pupil.name = "Jack";
//        pupil.getInfo();
//
//        Graduate graduate = new Graduate();
//        graduate.name = "Mike";
//        graduate.getInfo();
        Pupil pupil1 = new Pupil("zihao");
        System.out.println(pupil1.name);
        Pupil pupil2 = new Pupil("zihao", 24);
        System.out.println(pupil2.name + " " + pupil2.age);

        Graduate graduate1 = new Graduate("大学生");
        System.out.println(graduate1.name);
        Graduate graduate2 = new Graduate("大学生", 25);
        System.out.println(graduate2.name + " " + graduate2.age);
    }
}
