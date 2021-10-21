package com.sarvesh;

public class OddEven {
    public static void main(String[] args) {
        int n = 24;
        System.out.println(odd(n));

    }
    public static  boolean odd(int num){
        return (num & 1) ==1;
    }
}
