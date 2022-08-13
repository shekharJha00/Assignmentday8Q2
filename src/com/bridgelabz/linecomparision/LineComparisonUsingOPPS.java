package com.bridgelabz.linecomparision;


import java.util.Scanner;

public class LineComparisonUsingOPPS {
    public void compareToMethod() {
        LineVariables variables = new LineVariables();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 of First Point: ");
        variables.setX1(scanner.nextInt());
        System.out.println("Enter y1 of First Point: ");
        variables.setY1(scanner.nextInt());
        System.out.println("Enter x2 of Second Point: ");
        variables.setX2(scanner.nextInt());
        System.out.println("Enter y2 of Second Point: ");
        variables.setY2(scanner.nextInt());

        System.out.println("Enter p1 of Third Point: ");
        variables.setP1(scanner.nextInt());
        System.out.println("Enter q1 of Third Point: ");
        variables.setQ1(scanner.nextInt());
        System.out.println("Enter p2 of Forth Point: ");
        variables.setP2(scanner.nextInt());
        System.out.println("Enter q2 of Forth Point: ");
        variables.setQ2(scanner.nextInt());

        Double lenghtOfLine1 = Math.sqrt(Math.pow(variables.getX2() - variables.getX1(), 2)
                + Math.pow(variables.getY2() - variables.getY1(), 2));
        Double lenghtOfLine2 = Math.sqrt(Math.pow(variables.getP2() - variables.getP1(), 2)
                + Math.pow(variables.getQ2() - variables.getQ1(), 2));

        System.out.printf("Length of First Line is : %.2f %n", lenghtOfLine1);
        System.out.printf("Length of Second Line is : %.2f %n", lenghtOfLine2);

        int result = lenghtOfLine1.compareTo(lenghtOfLine2);
        if (result > 0) {
            System.out.println("Length of First end points is Greater than Length of Second end Points");
        } else if (result < 0) {
            System.out.println("Length of First end points is Less than Length of Second end Points");
        } else {
            System.out.println("Both Lines are Equal ");
        }

        System.out.println(variables.toString());

    }

    public static void main(String[] args) {
        LineComparisonUsingOPPS obj2 = new LineComparisonUsingOPPS();
        obj2.compareToMethod();
    }

}
