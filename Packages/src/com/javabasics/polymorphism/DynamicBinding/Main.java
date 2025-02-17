package com.javabasics.polymorphism.DynamicBinding;
//动态绑定
public class Main {
    public static void main(String[] args) {
        A a =new B();   //向上转型
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}

class A {
    public int i = 10;

    public int sum() {
        return getI() +10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

    public int sum() {
        return i + 20;
    }

    public int getI() {
        return i;
    }

    public int sum1() {
        return i + 20;
    }
}