package com.javabasics.polymorphism.PolymorphicParameter;
/*
    1.  定义员工类Employee，包含姓名和月工资（private），以及计算年工资getAnnual()方法
        经理和普通员工继承员工类
        经理类多出奖金bonus属性和管理manage()方法
        普通员工多出work()方法
        经理和普通员工类分别重写getAnnual()方法
    2.  测试类中添加一个方法showEmpAnnal(Employee e)，实现获取任何员工年工资，并在main中调用该方法
    3.  测试类中添加一个方法testWork()，如果是普通员工，则调用work()方法,如果是经理，调用manage()
 */
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Tom", 10000);
        Manager manager1 = new Manager("Jack", 20000, 50000);
        Main testFunc = new Main();
        testFunc.showEmpAnnual(worker1);
        testFunc.showEmpAnnual(manager1);

        testFunc.testWork(worker1);
        testFunc.testWork(manager1);

        Worker newWorker = new Worker();
        newWorker.setName("Jack");
        System.out.println(newWorker.getName());
    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if(e instanceof Manager) {
            Manager m = (Manager) e;
            System.out.println(m.manage());
        }else if(e instanceof Worker) {
            Worker w = (Worker) e;
            System.out.println(w.work());
        }
    }
}
