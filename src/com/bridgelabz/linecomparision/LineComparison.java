package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class LineComparison {


    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        int x1,y1,x2,y2;
        double res;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x coordinates of first point ");
        x1 = scan.nextInt();
        System.out.println("Enter y coordinates of first point ");
        y1 = scan.nextInt();
        System.out.println("Enter x coordinates of Second point ");
        x2 = scan.nextInt();
        System.out.println("Enter y coordinates of Second point ");
        y2 = scan.nextInt();

        res = Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
        System.out.println("Length of the line is : " + res);
    }
}

