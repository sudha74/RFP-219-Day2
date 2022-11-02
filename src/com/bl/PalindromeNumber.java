package com.bl;

import java.util.Scanner;

public class PalindromeNumber {
    void getPalindromeNumber() {
        Scanner scanner = new Scanner(System.in);
        int num, t, s = 0, rem;
        System.out.println("Enter any number : ");
        num = scanner.nextInt();
        t = num;
        for (int i = 0; num > 0; num /= 10) {
            rem = num % 10;
            s = (s * 10) + rem;
        }
        if (s == t) {
            System.out.println(t + " is a palindrome number");
        } else {
            System.out.println(t + " is not a palindrome number");
        }
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        palindromeNumber.getPalindromeNumber();
    }
}
