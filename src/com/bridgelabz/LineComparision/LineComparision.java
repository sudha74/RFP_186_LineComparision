package com.bridgelabz.LineComparision;

import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        Points point1 = new Points();
        Points point2 = new Points();
        Length line2 = new Length();
        Length line1 = new Length();

        System.out.println("Enter points for First line");
        point1.getPoints();
        point2.getPoints();
        Double length1 = line1.length(point1.getX(), point1.getY(), point2.getX(), point2.getY());
        System.out.println("Length of line1 is :" + length1);

        System.out.println("Enter points for second line");
        point1.getPoints();
        point2.getPoints();
        Double length2 = line2.length(point1.getX(), point1.getY(), point2.getX(), point2.getY());
        System.out.println("Length of line2 is :" + length2);
        System.out.println("Enter points for second line");

        if (length1.equals(length2)) {
            System.out.println("Lines are equal");
        } else if (length1.compareTo(length2) > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else if (length1.compareTo(length2) < 0) {
            System.out.println("Line 2 is greater than Line1");
        }
    }
}
