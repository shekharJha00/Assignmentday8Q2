package com.bridgelabz.linecomparision;


import java.util.Scanner;

public class LineComparison {


    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        int x1, y1, x2, y2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x coordinates of first point ");
        x1 = scanner.nextInt();
        System.out.println("Enter y coordinates of first point ");
        y1 = scanner.nextInt();
        System.out.println("Enter x coordinates of Second point ");
        x2 = scanner.nextInt();
        System.out.println("Enter y coordinates of Second point ");
        y2 = scanner.nextInt();

        System.out.println("Enter x1 of Third Point: ");
        int p1 = scanner.nextInt();
        System.out.println("Enter y1 of Third Point: ");
        int q1 = scanner.nextInt();
        System.out.println("Enter x2 of Forth Point: ");
        int p2 = scanner.nextInt();
        System.out.println("Enter y2 of Forth Point: ");
        int q2 = scanner.nextInt();
        scanner.close();


        Double lengthOfLine1 = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        Double lengthOfLine2 = Math.sqrt(Math.pow(p2 - p1, 2) + Math.pow(q2 - q1, 2));
        System.out.printf("Length of First Line is : %.2f %n", +lengthOfLine1);
        System.out.printf("Length of Second Line is : %.2f %n", +lengthOfLine2);

        boolean ans = lengthOfLine1.equals(lengthOfLine2);
        if (ans) {
            System.out.println("Both Lines are Equal");
        } else {
            System.out.println("Both Lines are not Equal ");
        }
    }
    }

