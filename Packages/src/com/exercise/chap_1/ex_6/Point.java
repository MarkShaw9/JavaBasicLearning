package com.exercise.chap_1.ex_6;

/**
 * @author Zihao Xiao
 * @date 2025/1/16 12:20
 * 设计一个Point类，其x和y坐标可以通过构造器提供。
 * 提供一个子类LabeledPoint，其构造器接受一个标签值和x，y坐标。
 * 例如：new LabeledPint("Black", 1920, 88.1)
 * 写出对应的构造器
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }
}
