package com.bl;

import java.util.Scanner;

public class ReverseNumber {
    static void findReversNumber() {
        int a, res = 0, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        n = scanner.nextInt();
//        for (;n!=0;){
//            a=n%10;
//            res=(res*10)+a;
//            n=n/10;
//        }
//        System.out.println("Reverse of a number is : "+res);
//
        while (n != 0) {
            a = n % 10;
            res = (res * 10) + a;
            n = n / 10;
        }
        System.out.println("Reverse of a number is : " + res);
    }

    public static void main(String[] args) {
        findReversNumber();
    }
}
