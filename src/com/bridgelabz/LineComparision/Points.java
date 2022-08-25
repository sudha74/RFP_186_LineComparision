package com.bridgelabz.LineComparision;

import java.util.Scanner;

public class Points {
    private double x, y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void getPoints() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point x");
        setX(scanner.nextInt());
        System.out.println("Enter point y");
        setY(scanner.nextInt());
    }
}
