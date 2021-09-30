package com.recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        int num;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        int ans = fibo(num);
        System.out.println(ans);

    }
    static int fibo(int x){
        if (x < 2){
            return x;
        }

       return fibo(x-1) + fibo(x-2);
    }
}
