package com.recursion;

public class Subsequensce {
    public static void main(String[] args) {
       String inp = "abc";
       findSubsequence("",inp);
    }
    static void findSubsequence(String ans,String input){
        if(input.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = input.charAt(0);
        findSubsequence(ans + ch,input.substring(1));
        findSubsequence(ans,input.substring(1));
    }
}
