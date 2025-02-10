package com.smallsystem.smallchangesys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        //variables
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        //明细UI
        String details = "--------明细--------";
        //收益入账
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //消费
        String note = null;

        //主页UI
        do{
            System.out.println("--------零钱通菜单--------");
            System.out.println("\t\t\t\t1 零钱通明细");
            System.out.println("\t\t\t\t2 收益入账");
            System.out.println("\t\t\t\t3 消费");
            System.out.println("\t\t\t\t4 退     出");

            System.out.print("请选择（1-4）");
            key = scanner.next();

            //switch control
            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
                    //money的值需要校验，需要大于等于0
                    if (money <= 0) {
                        System.out.println("入账金额需要大于等于0");
                        break;
                    }
                    balance += money;
                    //拼接收益入账信息到details中
                    date = new Date();
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t当前余额" + balance;
                    System.out.println("收款成功！");
                    break;
                case "3":
                    System.out.print("消费金额：");
                    money = scanner.nextDouble();
                    //money的值需要校验，需要大于等于0，且小于当前余额balance
                    if (money <= 0 || money > balance) {
                        System.out.println("消费金额需要大于等于0，且小于当前余额" + balance);
                        break;
                    }
                    System.out.print("消费说明：");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t当前余额" + balance;
                    System.out.println("消费成功！");
                    break;
                case "4":
                    String answer;
                    while (true) {
                        System.out.println("你确定要退出吗？y/n");
                        answer = scanner.next();
                        if (answer.equals("y") || answer.equals("n")) {
                            break;
                        }
                    }
                    if (answer.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("输入有误，重新输入（1-4）");
            }
        }while(loop);

        System.out.println("--------退出了系统--------");
    }
}
