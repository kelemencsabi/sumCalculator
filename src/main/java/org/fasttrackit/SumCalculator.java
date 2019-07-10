package org.fasttrackit;

import java.util.Scanner;

public class SumCalculator {

    public static void sumCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = input.nextDouble();
        double sum = num1 + num2;
        System.out.println("Sum=" + sum);


    }

}
