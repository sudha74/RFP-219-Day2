package com.bl;

public class SumNatural {
    public static void main(String[] args) {
        m1();
        int num=100,sum=0;
        for (int i=0;i<num;i++){
            sum=sum+i;
           // sum+=i;
            System.out.println("sum is : "+sum);
        }
    }
    static void m1(){           //better to use for-loop cz v know how many times v have to iterate
        int num=50,i=1,sum=0;
        while (i<=num){
            sum+=i;
            i++;
        }
        System.out.println("sum is : "+sum);
    }
}
