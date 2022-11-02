package com.bl;

import java.util.Scanner;

public class QuadraticEquation {
    static double rootsOfQuadraticEquation() {
        double firstRoot = 0, secondRoot = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        double a = scanner.nextInt();
        System.out.println("Enter the value of b : ");
        double b = scanner.nextInt();
        System.out.println("Enter the value of c : ");
        double c = scanner.nextInt();

        double determnant = (b * b) - (4 * a * c);
        double sqrt = Math.sqrt(determnant);

        if (determnant > 0) {
            firstRoot = (-b + sqrt) / (2 * a);
            firstRoot = (-b - sqrt) / (2 * a);
            System.out.println("Roots are : " + firstRoot + "" + secondRoot);
        } else if (determnant == 0) {
            System.out.println("Root is : " + (-b + sqrt) / 2 * a);
        }
        return sqrt;
    }

    public static void main(String[] args) {
        rootsOfQuadraticEquation();
    }
}
