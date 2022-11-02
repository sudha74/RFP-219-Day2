package com.bl;

import java.util.Scanner;

public class Calculate {
    void performAllArithematicOperations() {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        m = scanner.nextInt();
        System.out.println("Enter the second number");
        n = scanner.nextInt();

        int addition = m + n;
        System.out.println("The sum of two numbers is : " + addition);
        int subtraction = m - n;
        System.out.println("The difference of two numbers is : " + subtraction);
        int multiplication = m * n;
        System.out.println("The product of two numbers is : " + multiplication);
        int division = m / n;
        System.out.println("The division of two numbers is : " + division);
        int modulo = m % n;
        System.out.println("The modulo of two numbers is : " + modulo);
    }

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.performAllArithematicOperations();
    }
}
